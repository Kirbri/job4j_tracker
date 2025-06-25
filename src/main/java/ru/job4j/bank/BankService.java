package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Банковский сервис, где происходит взаимодействие пользователя банка и банковского счёта.
 * Поле класса - словарь, который содержит всех пользователей системы с привязанными к ним счетам.
 */

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему
     *
     * @param user пользователь, который добавляется в словарь, если его ещё нет
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя из системы
     *
     * @param passport номер паспорта, по которому происходит поиск и удаление пользователя
     */
    public void deleteUser(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.remove(user);
            }
        }
    }

    /**
     * Метод добавляет новый счёт к пользователю
     *
     * @param passport уникальное поле - паспорт, по которому ищется пользователь
     * @param account  модель банковского счёта, в которую добавляется счёт, если такого у пользователя ещё нет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     *
     * @param passport уникальное поле - паспорт, по которому можно найти пользователь
     * @return пользователь, которого нашли по заданному паспорту
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по реквизитам
     *
     * @param passport  уникальное поле для поиска счёта
     * @param requisite реквизиты для поиска счёта
     * @return счёт, которого нашли по паспорту и реквизитам
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой
     *
     * @param sourcePassport       поле паспорта, с которого будет отправлен перевод
     * @param sourceRequisite      поле реквизитов, с которого будет отправлен перевод
     * @param destinationPassport  поле паспорта, на который будут направлены деньги
     * @param destinationRequisite поле реквизитов, на который будут направлены деньги
     * @param amount               сумма перевода
     * @return true - все данные актуальны и хватает суммы для перевода, false ы других случаях
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account accountSour = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDest = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSour != null && accountDest != null && accountSour.getBalance() >= amount) {
            result = true;
            accountDest.setBalance((accountDest.getBalance() + amount));
            accountSour.setBalance((accountSour.getBalance() - amount));
        }

        return result;
    }

    /**
     * Метод для получения списка счетов пользователя
     *
     * @param user пользователь, для которого необходимо получить список счетов
     * @return список счетов
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
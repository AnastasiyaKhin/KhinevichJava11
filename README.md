# Описание

## Задание

Составьте алгоритм:
* Если введенное число больше 7, то вывести “Привет”;
* Если введенное имя совпадает с “Вячеслав”, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени";
* На входе есть числовой массив, необходимо вывести элементы массива, кратные 3.

## Реализация алгоритма

В качестве языка программирования использован Java 11.

### Формат ввода

Пользователь вводит число, имя или массив чисел с помощью стандартного потока ввода. 
Разделителями элементов массива могут являться запятые, пробелы или точка с запятой, так как инное не было обозначено в техническом задании

### Обработка исключений

Если при вводе числа возникает исключение NumberFormatException, то выполняются следующие действия:
* Если входная строка является массивом чисел, то выводятся элементы массива, кратные 3;
* Если входная строка является именем, то выводится приветствие в зависимости от условий задачи;
* Если входная строка не удовлетворяет ни одному из определенных форматов, то выводится сообщение об ошибке.

### Результат выполнения

В результате выполнения программы на экран выводятся результаты, соответствующие введенным данным:
* Если введенное число больше 7, программа выводит "Привет";
* Если введенное имя совпадает с "Вячеслав", программа выводит "Привет, Вячеслав", в противном случае - "Нет такого имени";
* Если на входе был получен массив чисел, программа выводит на экран элементы массива, кратные 3.

## Примечание

Так как не был указан тип данных для вводимого числа, то при написании алгоритма был использован тип int (как для простого числа так и для элементов массива). 
Так как в техническом задании не указаны требования для 0 при проверке кратности 3 элементов массива, то было принято по умолчанию математическое определение кратности.
(число 0 не является кратным 3 согласно законам математики)
# Промежуточная контрольная работа по блоку специализация
## Задание 1. Приложение заметки (Python)
### Информация о проекте
Необходимо написать проект, содержащий функционал работы с заметками.
Программа должна уметь создавать заметку, сохранять её, читать список
заметок, редактировать заметку, удалять заметку.
### Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий (Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
### Задание
Реализовать консольное приложение заметки, с сохранением, чтением,
добавлением, редактированием и удалением заметок. Заметка должна
содержать идентификатор, заголовок, тело заметки и дату/время создания или
последнего изменения заметки. Сохранение заметок необходимо сделать в
формате json или csv формат (разделение полей рекомендуется делать через
точку с запятой). Реализацию пользовательского интерфейса студент может
делать как ему удобнее, можно делать как параметры запуска программы
(команда, данные), можно делать как запрос команды с консоли и
последующим вводом данных, как-то ещё, на усмотрение студента.
Например:  
python notes.py add --title "новая заметка" –msg "тело новой заметки"  
Или так:  
python note.py  
Введите команду: add  
Введите заголовок заметки: новая заметка  
Введите тело заметки: тело новой заметки  
Заметка успешно сохранена  
Введите команду:  
При чтении списка заметок реализовать фильтрацию по дате.  
### Критерии оценки
Приложение должно запускаться без ошибок, должно уметь сохранять данные
в файл, уметь читать данные из файла, делать выборку по дате, выводить на
экран выбранную запись, выводить на экран весь список записок, добавлять
записку, редактировать ее и удалять.
## Задание 2. Магазин игрушек (Java)
### Информация о проекте
Программа на Java - Необходимо написать программу, для розыгрыша игрушек в магазине детских товаров.
### Как сдавать проект
Выкладываем в отдельный общедоступный репозиторий Github.  
Программа должна запускаться и работать, ошибок при выполнении программы быть не должно.
### Задание
Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.  
Стараемся применять ООП и работу с файлами.  
*Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом. Например, у кого в курсе не было ООП, то применяем списки\массивы\словари.*
**Желательный функционал программы:**
В программе должен быть минимум один класс со следующими свойствами:  
* id игрушки,  
* текстовое название,  
* количество,  
* частота выпадения игрушки (вес в % от 100),  
* метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки), 
* возможность организовать розыгрыш игрушек. 
 
Например, следующим образом:  
С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.  
Это список призовых игрушек, которые ожидают выдачи.  
Еще у нас должен быть метод – получения призовой игрушки.  
После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл.  
Не забываем уменьшить количество игрушек.  
К написанию программы можно подойти более творчески и делать так, как Вы поняли задание. Немного менять и отходить от примера выше.


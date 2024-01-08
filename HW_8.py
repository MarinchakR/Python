# file = open('phone_book.txt', 'w', encoding='utf-8')
# with open('phone_book.txt', 'a', encoding='utf-8') as fd:
#   fd.write('Новая строка\n')
# with open('phone_book.txt', 'a', encoding='utf-8') as fd:
#   res = fd.readlines()
#
# print(res)

# Фамилия, Имя, Отчество, номер телефона
# Иванов, Иван, Иванович, 555

def add_contact(file):
    last_name = input('Введите фамилию: ')
    first_name = input('Введите имя: ')
    patronomic = input('Введите отчество: ')
    phone_number = input('Введите номер телефона: ')
    with open(file, 'a', encoding='utf-8') as fd:
        fd.write(f'{last_name},{first_name},{patronomic},{phone_number}\n')

def get_contacts_from_file(file):
    with open(file, 'r', encoding='utf-8') as fd:
        contacts = fd.readlines()
    #c = [contac.rtrstrip().split(',') for contact in contacts]
    return [contact.rstrip().split(',') for contact in contacts]

def print_contacts(contacts_list):
    for contact in contacts_list:
        print(' | '.join(contact))

def show_all(file):
    contacts = get_contacts_from_file(file)
    print_contacts(contacts)

def search_contacts(file):
    search_str = input('Введите фамилию для поиска: ').lower()
    contacts = get_contacts_from_file(file)
    search_result = []
    for contact in contacts:
        # Иванов | Иван | Иванович | 555
        if search_str in contact[0].lower():
            search_result.append(contact)
    #print(search_result)
    print_contacts(search_result)

def copy_contact(file):
    file2 = 'Python/userbook.txt'
    with open(file, 'r', encoding='utf-8') as file1:
        lines = file1.readlines()
    line_number = int(input('Введите номер строки: ')) - 1
    if line_number < len(lines):
        with open(file2, 'a', encoding='utf-8') as file2:
            file2.write(lines[line_number])
            print('Данные абонента успешно скопированны.')
    else:
        print('Абонент не найден.')
    #get_contacts_from_file(file)
    #lines = contact_file.readline()
    #for i, line in enumerate(lines):
    #    print(f'{i+1}: {line.strip()}')


def main():
    file_name = 'Python/contacts.txt'
    flag = True
    while flag:
        user_answer = input('Выберите для записи - 1, для чтения - 2, для поиска - 3, для копирования контакта - 4, для выхода - 0: ')
        if user_answer == '1':
            add_contact(file_name)
        elif user_answer == '2':
            show_all(file_name)
        elif user_answer == '3':
            search_contacts(file_name)
        elif user_answer == '4':
            copy_contact(file_name)
        elif user_answer == '0':
            print('Спасибо за использование нашей программы')
            flag = False




if __name__ == '__main__':
    main()
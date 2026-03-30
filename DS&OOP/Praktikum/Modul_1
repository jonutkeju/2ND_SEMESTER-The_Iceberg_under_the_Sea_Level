#include <iostream>
#define MAX 100
using namespace std;

class Character {
    protected:
    string name;
    char grade;
    int hp;
    int attackPower;

    public:
    Character(string name, char grade, int hp, int attackPower) {
        this->name = name;
        this->grade = grade;
        this->hp = hp;
        this->attackPower = attackPower;
    }

    void setGrade(char newGrade) {
        this->grade = newGrade;
    }
    char getGrade() { 
        return grade; 
    }
    string getName() {
        return name; 
    }

    virtual void displayInfo() = 0;

    virtual void useSkill() = 0;

    virtual ~Character() {}
};


class Scientist : public Character {
private:
  int sciencePoint;

public:
  Scientist(string name, char grade, int hp, int attackPower, int sciencePoint)
      : Character(name, grade, hp, attackPower) {
    this->sciencePoint = sciencePoint;
  }


  void displayInfo() override {
    if (name != "") {
      cout << "   Name: " << name << " - Grade: " << grade << " - HP: " << hp << " - AP: " << attackPower << " - SP: " << sciencePoint << endl;
    }
  }

  void useSkill() override {
    if (sciencePoint >= 40) {
      sciencePoint -= 40;
      cout << "   " << name << " meracik Sulfuric Acid Bomb! 10 Billion Percent effective!" << endl;
    } else {
      cout << "   Science Point " << name << " tidak cukup untuk melakukan sintesis!" << endl;
    }
  }
};

class Warrior : public Character {
private:
  int stamina;

public:
  Warrior(string name, char grade, int hp, int attackPower, int stamina)
      : Character(name, grade, hp, attackPower) {
    this->stamina = stamina;
  }


  void displayInfo() override {
    if (name != "") {
      cout << "   Name: " << name << " - Grade: " << grade << " - HP: " << hp << " - AP: " << attackPower << " - Stamina: " << stamina << endl;
    }
  }

  void useSkill() override {
    if (stamina >= 25) {
      stamina -= 25;
      cout << "   " << name << " menghantam musuh dengan batu besar! Primitive but OVERWHELMING!" << endl;
    } else {
      cout << "   Stamina " << name << " tidak cukup! Perlu istirahat dulu." << endl;
    }
  }
};


Character* roster[MAX];
int jumlahCharacter = 0;

void createCharacter() {
    string name;
    char grade;
    int hp;
    int attackPower;
    int type;


    cout << "   Masukkan tipe (1: Scientist, 2: Warrior): ";
    cin >> type;
    if (type != 1 && type != 2) {
        cout << "   Tipe tidak valid!" << endl;
    } else {
    cout << "   Masukkan nama: ";
    cin.ignore();
    getline(cin, name);
    for (int i = 0; i < jumlahCharacter; i++) {
        if (roster[i]->getName() == name) {
            cout << "   Nama karakter sudah ada!" << endl;
            return;
        }
    }
    cout << "   Masukkan grade: ";
    cin >> grade;
    if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D') {
        cout << "   Grade invalid!" << endl;
        return;
    }
    cout << "   Masukkan HP: ";
    cin >> hp;
    cout << "   Masukkan attack power: ";
    cin >> attackPower;
    if (type == 1) {
        int sciencePoint;
        cout << "   Masukkan sciencePoint: ";
        cin >> sciencePoint;
        roster[jumlahCharacter] = new Scientist(name, grade, hp, attackPower, sciencePoint);
        jumlahCharacter++;
    } else if (type == 2) {
        int stamina;    
        cout << "   Masukkan stamina: ";
        cin >> stamina;
        roster[jumlahCharacter] = new Warrior(name, grade, hp, attackPower, stamina);
        jumlahCharacter++;
    }
}
}

void displayCharacter() {
    if (jumlahCharacter == 0) {
        cout << "   Belum ada karakter!" << endl;
    } else {
        cout << "---------- DAFTAR KARAKTER ----------" << endl;
        for (int i = 0; i < jumlahCharacter; i++) {
            cout << i + 1 << ". ";
            roster[i]->displayInfo();
        }
    }
}

void promoteCharacter() {
    string name;
    cout << "   Masukkan karakter yang ingin di promote: ";
    cin.ignore();
    getline(cin, name);
    bool found = false;
    for (int i = 0; i < jumlahCharacter; i++) {
        if (roster[i]->getName() == name) {
            found = true;
            char levelUp;
            levelUp = roster[i]->getGrade();
            if (levelUp == 'A') {
                cout << "Karakter " << name << " sudah grade A!" << endl;
                break;
            }
            roster[i]->setGrade(levelUp - 1);
            cout << "Karakter " << name << " berhasil dipromote ke grade " << roster[i]->getGrade() << endl;
            break;
        }
    }
    if (!found) {
        cout << "Karakter " << name << " tidak ditemukan!" << endl;
    }
}

void deleteCharacter() {
    string name;
    cout << "   Masukkan karakter gugur: ";
    cin.ignore();
    getline(cin, name);
    bool found = false;
    for (int i = 0; i < jumlahCharacter; i++) {
        if (roster[i]->getName() == name) {
            found = true;
            delete roster[i];
            for (int j = i; j < jumlahCharacter - 1; j++) {
                roster[j] = roster[j + 1];
            }
            jumlahCharacter--;
            cout << "   Karakter " << name << " sudah dihapus!" << endl;
            break;
        }
    }
    if (!found) {
        cout << "   Karakter " << name << " tidak ditemukan!" << endl;
    }
}

void simulateSkill() {
    string name;
    cout << "   Masukkan karakter untuk melihat skillnya: ";
    cin.ignore();
    getline(cin, name);
    bool found = false;
    for (int i = 0; i < jumlahCharacter; i++) {
        if (roster[i]->getName() == name) {
            found = true;
            roster[i]->useSkill();
            break;
        }
    }
    if (!found) {
        cout << "   Karakter " << name << " tidak ditemukan!" << endl;
    }
}

void menu() {
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "   --- WELCOME TO ---------------------------> " << endl;
    cout << " <------------------- KINGDOM OF SCIENCE ---   " << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "|  Rekrut Karakter                        [1] |" << endl;
    cout << "|  Cek Roster Karakter                    [2] |" << endl;
    cout << "|  Promote Grade Karakter                 [3] |" << endl;
    cout << "|  Hapus Karakter dari Roster             [4] |" << endl;
    cout << "|  Simulasi Skill Karakter                [5] |" << endl;
    cout << "|  Keluar dari Kingdom                    [6] |" << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
}

int main() {
  while (true) {
    menu();
    int choice;
    cout << "   Masukkan pilihan: ";
    cin >> choice;
    switch (choice) {
        case 1:
            system("cls");
            createCharacter();
            break;
        case 2:
            system("cls");
            displayCharacter();
            break;
        case 3:
            system("cls");
            promoteCharacter();
            break;
        case 4:
            system("cls");
            deleteCharacter();
            break;
        case 5:
            system("cls");
            simulateSkill();
            break;
        case 6:
            system("cls");
            cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
            cout << " Selamat Jalan! Kingdom menunggu anda kembali! " << endl;
            cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
            return 0;
        default:
            cout << "   Pilihan Invalid!!!" << endl;
            break;
    }
  }
}

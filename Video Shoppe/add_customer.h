#ifndef ADD_CUSTOMER_H
#define ADD_CUSTOMER_H

#include <QMainWindow>

namespace Ui {
class add_customer;
}

class add_customer : public QMainWindow
{
    Q_OBJECT

public:
    explicit add_customer(QWidget *parent = nullptr);
    ~add_customer();

private slots:
    void on_cancelAction_clicked();

    void on_confirm_clicked();

private:
    Ui::add_customer *ui;
    QString name;
    QString email;
    QString phone;
    QString dLicense;
    QString mailing;
    QString birthdate;
    QString cardNumber;
};

#endif // ADD_CUSTOMER_H

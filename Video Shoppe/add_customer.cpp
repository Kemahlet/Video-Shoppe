#include "add_customer.h"
#include "ui_add_customer.h"

add_customer::add_customer(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::add_customer)
{
    ui->setupUi(this);
}

add_customer::~add_customer()
{
    delete ui;
}

void add_customer::on_cancelAction_clicked()
{

}

void add_customer::on_confirm_clicked()
{

}

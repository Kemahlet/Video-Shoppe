#include "ui_mainwindow.h"
#include "mainwindow.h"
#include <QMessageBox>
#include <QSqlRecord>


MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent),
        ui(new Ui::MainWindow)
        {
            ui->setupUi(this);
        }

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_login_clicked()
{
    QSqlDatabase customers = QSqlDatabase::addDatabase("QMYSQL");
        customers.setHostName("host");
        customers.setUserName("root");
        customers.setPassword("");
        customers.setDatabaseName("videoshoppe");

        if (customers.open())
        {
            QMessageBox::information(this,"Successful","Succesful connection");
        }
        else
        {
            QMessageBox::information(this,"Failure", "Failed Connection");
        }
/*
    this->loggedIn = Login(ui->username->text(), ui->password->text());
        if(this->loggedIn)
        {
            this->username = ui->username->text();
            this->password = ui->password->text();
            ui->label_2->setText("Login Successful");

        }
        else
        {
            ui->label_2->setText("Login failed: Please try again.");
        }*/
}

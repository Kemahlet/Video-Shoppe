#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "addCustomer.h"
#include "ui_addCustomer.h"

#include <QApplication>
#include <QtSql/QSqlDatabase>
#include <QMessageBox>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    MainWindow w;

    w.show();
    return a.exec();
}

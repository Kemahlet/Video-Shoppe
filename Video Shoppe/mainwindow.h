#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QtSql>
#include <QSqlDatabase>
#include <QMessageBox>
#include <manager_page.h>
#include <clerk_page.h>

QT_BEGIN_NAMESPACE
namespace Ui {
class MainWindow;

}
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();
    bool Login(QString username, QString password);
    bool loggedIn;

private slots:
    void on_login_clicked();

private:
    Ui::MainWindow *ui;
    QString username;
    QString password;

};
#endif // MAINWINDOW_H

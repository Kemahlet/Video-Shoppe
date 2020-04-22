#include "manager_page.h"
#include "ui_manager_page.h"

manager_page::manager_page(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::manager_page)
{
    ui->setupUi(this);
}

manager_page::~manager_page()
{
    delete ui;
}

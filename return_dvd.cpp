#include "return_dvd.h"
#include "ui_return_dvd.h"

return_dvd::return_dvd(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::return_dvd)
{
    ui->setupUi(this);
}

return_dvd::~return_dvd()
{
    delete ui;
}

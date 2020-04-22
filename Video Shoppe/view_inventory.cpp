#include "view_inventory.h"
#include "ui_view_inventory.h"

view_inventory::view_inventory(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::view_inventory)
{
    ui->setupUi(this);
}

view_inventory::~view_inventory()
{
    delete ui;
}

#include "clerk_page.h"
#include "ui_clerk_page.h"

clerk_page::clerk_page(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::clerk_page)
{
    ui->setupUi(this);
}

clerk_page::~clerk_page()
{
    delete ui;
}

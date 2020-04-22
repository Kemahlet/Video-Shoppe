#ifndef MANAGER_PAGE_H
#define MANAGER_PAGE_H

#include <QMainWindow>

namespace Ui {
class manager_page;
}

class manager_page : public QMainWindow
{
    Q_OBJECT

public:
    explicit manager_page(QWidget *parent = nullptr);
    ~manager_page();

private:
    Ui::manager_page *ui;
};

#endif // MANAGER_PAGE_H

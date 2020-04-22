#ifndef CLERK_PAGE_H
#define CLERK_PAGE_H

#include <QMainWindow>

namespace Ui {
class clerk_page;
}

class clerk_page : public QMainWindow
{
    Q_OBJECT

public:
    explicit clerk_page(QWidget *parent = nullptr);
    ~clerk_page();

private:
    Ui::clerk_page *ui;
};

#endif // CLERK_PAGE_H

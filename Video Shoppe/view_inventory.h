#ifndef VIEW_INVENTORY_H
#define VIEW_INVENTORY_H

#include <QMainWindow>

namespace Ui {
class view_inventory;
}

class view_inventory : public QMainWindow
{
    Q_OBJECT

public:
    explicit view_inventory(QWidget *parent = nullptr);
    ~view_inventory();

private:
    Ui::view_inventory *ui;
};

#endif // VIEW_INVENTORY_H

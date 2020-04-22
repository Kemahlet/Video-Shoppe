#ifndef RETURN_DVD_H
#define RETURN_DVD_H

#include <QMainWindow>

namespace Ui {
class return_dvd;
}

class return_dvd : public QMainWindow
{
    Q_OBJECT

public:
    explicit return_dvd(QWidget *parent = nullptr);
    ~return_dvd();

private:
    Ui::return_dvd *ui;
};

#endif // RETURN_DVD_H

/********************************************************************************
** Form generated from reading UI file 'return_dvd.ui'
**
** Created by: Qt User Interface Compiler version 5.14.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_RETURN_DVD_H
#define UI_RETURN_DVD_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_return_dvd
{
public:
    QWidget *centralwidget;
    QWidget *verticalLayoutWidget;
    QVBoxLayout *verticalLayout;
    QLabel *label;
    QLineEdit *lineEdit;
    QHBoxLayout *horizontalLayout;
    QPushButton *pushButton;
    QPushButton *pushButton_2;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *return_dvd)
    {
        if (return_dvd->objectName().isEmpty())
            return_dvd->setObjectName(QString::fromUtf8("return_dvd"));
        return_dvd->resize(320, 240);
        centralwidget = new QWidget(return_dvd);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        verticalLayoutWidget = new QWidget(centralwidget);
        verticalLayoutWidget->setObjectName(QString::fromUtf8("verticalLayoutWidget"));
        verticalLayoutWidget->setGeometry(QRect(60, 50, 201, 101));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        label = new QLabel(verticalLayoutWidget);
        label->setObjectName(QString::fromUtf8("label"));

        verticalLayout->addWidget(label);

        lineEdit = new QLineEdit(verticalLayoutWidget);
        lineEdit->setObjectName(QString::fromUtf8("lineEdit"));

        verticalLayout->addWidget(lineEdit);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        pushButton = new QPushButton(verticalLayoutWidget);
        pushButton->setObjectName(QString::fromUtf8("pushButton"));

        horizontalLayout->addWidget(pushButton);

        pushButton_2 = new QPushButton(verticalLayoutWidget);
        pushButton_2->setObjectName(QString::fromUtf8("pushButton_2"));

        horizontalLayout->addWidget(pushButton_2);


        verticalLayout->addLayout(horizontalLayout);

        return_dvd->setCentralWidget(centralwidget);
        menubar = new QMenuBar(return_dvd);
        menubar->setObjectName(QString::fromUtf8("menubar"));
        menubar->setGeometry(QRect(0, 0, 320, 21));
        return_dvd->setMenuBar(menubar);
        statusbar = new QStatusBar(return_dvd);
        statusbar->setObjectName(QString::fromUtf8("statusbar"));
        return_dvd->setStatusBar(statusbar);

        retranslateUi(return_dvd);

        QMetaObject::connectSlotsByName(return_dvd);
    } // setupUi

    void retranslateUi(QMainWindow *return_dvd)
    {
        return_dvd->setWindowTitle(QCoreApplication::translate("return_dvd", "MainWindow", nullptr));
        label->setText(QCoreApplication::translate("return_dvd", "Enter Barcode:", nullptr));
        pushButton->setText(QCoreApplication::translate("return_dvd", "Return", nullptr));
        pushButton_2->setText(QCoreApplication::translate("return_dvd", "PushButton", nullptr));
    } // retranslateUi

};

namespace Ui {
    class return_dvd: public Ui_return_dvd {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_RETURN_DVD_H

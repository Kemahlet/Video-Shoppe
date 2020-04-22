/********************************************************************************
** Form generated from reading UI file 'add_employee.ui'
**
** Created by: Qt User Interface Compiler version 5.14.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ADD_EMPLOYEE_H
#define UI_ADD_EMPLOYEE_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QFrame>
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

class Ui_add_employee
{
public:
    QWidget *centralwidget;
    QFrame *frame;
    QWidget *verticalLayoutWidget;
    QVBoxLayout *verticalLayout;
    QLabel *label_6;
    QLabel *label_3;
    QLabel *label_2;
    QLabel *label_5;
    QLabel *label_4;
    QLabel *label_8;
    QWidget *verticalLayoutWidget_2;
    QVBoxLayout *verticalLayout_2;
    QLineEdit *name;
    QLineEdit *password;
    QLineEdit *paymentNumber;
    QLineEdit *bankRouting;
    QLineEdit *mailing;
    QLineEdit *phone;
    QLabel *label;
    QWidget *horizontalLayoutWidget;
    QHBoxLayout *horizontalLayout;
    QPushButton *pushButton_2;
    QPushButton *pushButton;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *add_employee)
    {
        if (add_employee->objectName().isEmpty())
            add_employee->setObjectName(QString::fromUtf8("add_employee"));
        add_employee->resize(640, 480);
        centralwidget = new QWidget(add_employee);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        frame = new QFrame(centralwidget);
        frame->setObjectName(QString::fromUtf8("frame"));
        frame->setGeometry(QRect(10, 10, 622, 371));
        frame->setFrameShape(QFrame::StyledPanel);
        frame->setFrameShadow(QFrame::Raised);
        verticalLayoutWidget = new QWidget(frame);
        verticalLayoutWidget->setObjectName(QString::fromUtf8("verticalLayoutWidget"));
        verticalLayoutWidget->setGeometry(QRect(30, 40, 161, 231));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout->setObjectName(QString::fromUtf8("verticalLayout"));
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        label_6 = new QLabel(verticalLayoutWidget);
        label_6->setObjectName(QString::fromUtf8("label_6"));

        verticalLayout->addWidget(label_6);

        label_3 = new QLabel(verticalLayoutWidget);
        label_3->setObjectName(QString::fromUtf8("label_3"));

        verticalLayout->addWidget(label_3);

        label_2 = new QLabel(verticalLayoutWidget);
        label_2->setObjectName(QString::fromUtf8("label_2"));

        verticalLayout->addWidget(label_2);

        label_5 = new QLabel(verticalLayoutWidget);
        label_5->setObjectName(QString::fromUtf8("label_5"));

        verticalLayout->addWidget(label_5);

        label_4 = new QLabel(verticalLayoutWidget);
        label_4->setObjectName(QString::fromUtf8("label_4"));

        verticalLayout->addWidget(label_4);

        label_8 = new QLabel(verticalLayoutWidget);
        label_8->setObjectName(QString::fromUtf8("label_8"));

        verticalLayout->addWidget(label_8);

        verticalLayoutWidget_2 = new QWidget(frame);
        verticalLayoutWidget_2->setObjectName(QString::fromUtf8("verticalLayoutWidget_2"));
        verticalLayoutWidget_2->setGeometry(QRect(210, 40, 191, 241));
        verticalLayout_2 = new QVBoxLayout(verticalLayoutWidget_2);
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        name = new QLineEdit(verticalLayoutWidget_2);
        name->setObjectName(QString::fromUtf8("name"));

        verticalLayout_2->addWidget(name);

        password = new QLineEdit(verticalLayoutWidget_2);
        password->setObjectName(QString::fromUtf8("password"));

        verticalLayout_2->addWidget(password);

        paymentNumber = new QLineEdit(verticalLayoutWidget_2);
        paymentNumber->setObjectName(QString::fromUtf8("paymentNumber"));

        verticalLayout_2->addWidget(paymentNumber);

        bankRouting = new QLineEdit(verticalLayoutWidget_2);
        bankRouting->setObjectName(QString::fromUtf8("bankRouting"));

        verticalLayout_2->addWidget(bankRouting);

        mailing = new QLineEdit(verticalLayoutWidget_2);
        mailing->setObjectName(QString::fromUtf8("mailing"));

        verticalLayout_2->addWidget(mailing);

        phone = new QLineEdit(verticalLayoutWidget_2);
        phone->setObjectName(QString::fromUtf8("phone"));

        verticalLayout_2->addWidget(phone);

        label = new QLabel(frame);
        label->setObjectName(QString::fromUtf8("label"));
        label->setGeometry(QRect(30, 280, 231, 31));
        horizontalLayoutWidget = new QWidget(frame);
        horizontalLayoutWidget->setObjectName(QString::fromUtf8("horizontalLayoutWidget"));
        horizontalLayoutWidget->setGeometry(QRect(29, 320, 371, 41));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget);
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        horizontalLayout->setContentsMargins(0, 0, 0, 0);
        pushButton_2 = new QPushButton(horizontalLayoutWidget);
        pushButton_2->setObjectName(QString::fromUtf8("pushButton_2"));

        horizontalLayout->addWidget(pushButton_2);

        pushButton = new QPushButton(horizontalLayoutWidget);
        pushButton->setObjectName(QString::fromUtf8("pushButton"));

        horizontalLayout->addWidget(pushButton);

        add_employee->setCentralWidget(centralwidget);
        menubar = new QMenuBar(add_employee);
        menubar->setObjectName(QString::fromUtf8("menubar"));
        menubar->setGeometry(QRect(0, 0, 640, 21));
        add_employee->setMenuBar(menubar);
        statusbar = new QStatusBar(add_employee);
        statusbar->setObjectName(QString::fromUtf8("statusbar"));
        add_employee->setStatusBar(statusbar);

        retranslateUi(add_employee);

        QMetaObject::connectSlotsByName(add_employee);
    } // setupUi

    void retranslateUi(QMainWindow *add_employee)
    {
        add_employee->setWindowTitle(QCoreApplication::translate("add_employee", "MainWindow", nullptr));
        label_6->setText(QCoreApplication::translate("add_employee", "Name: ", nullptr));
        label_3->setText(QCoreApplication::translate("add_employee", "Password:", nullptr));
        label_2->setText(QCoreApplication::translate("add_employee", "Payment Card:", nullptr));
        label_5->setText(QCoreApplication::translate("add_employee", "Bank Routing Number:", nullptr));
        label_4->setText(QCoreApplication::translate("add_employee", "Mailing Address:", nullptr));
        label_8->setText(QCoreApplication::translate("add_employee", "Phone Number:", nullptr));
        label->setText(QCoreApplication::translate("add_employee", "Employee Classification: ", nullptr));
        pushButton_2->setText(QCoreApplication::translate("add_employee", "Sales Clerk", nullptr));
        pushButton->setText(QCoreApplication::translate("add_employee", "Manager", nullptr));
    } // retranslateUi

};

namespace Ui {
    class add_employee: public Ui_add_employee {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ADD_EMPLOYEE_H

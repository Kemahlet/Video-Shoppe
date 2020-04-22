/********************************************************************************
** Form generated from reading UI file 'add_customer.ui'
**
** Created by: Qt User Interface Compiler version 5.14.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ADD_CUSTOMER_H
#define UI_ADD_CUSTOMER_H

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

class Ui_add_customer
{
public:
    QWidget *centralwidget;
    QFrame *frame;
    QWidget *verticalLayoutWidget;
    QVBoxLayout *verticalLayout;
    QLabel *label_6;
    QLabel *label_2;
    QLabel *label_5;
    QLabel *label;
    QLabel *label_4;
    QLabel *label_3;
    QLabel *label_7;
    QWidget *verticalLayoutWidget_2;
    QVBoxLayout *verticalLayout_2;
    QLineEdit *name;
    QLineEdit *birthdate;
    QLineEdit *phone;
    QLineEdit *email;
    QLineEdit *mailing;
    QLineEdit *dLicense;
    QLineEdit *cardNumber;
    QWidget *horizontalLayoutWidget;
    QHBoxLayout *horizontalLayout;
    QPushButton *confirm;
    QPushButton *cancelAction;
    QLabel *label_8;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *add_customer)
    {
        if (add_customer->objectName().isEmpty())
            add_customer->setObjectName(QString::fromUtf8("add_customer"));
        add_customer->resize(640, 480);
        centralwidget = new QWidget(add_customer);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        frame = new QFrame(centralwidget);
        frame->setObjectName(QString::fromUtf8("frame"));
        frame->setGeometry(QRect(20, 20, 622, 332));
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

        label_2 = new QLabel(verticalLayoutWidget);
        label_2->setObjectName(QString::fromUtf8("label_2"));

        verticalLayout->addWidget(label_2);

        label_5 = new QLabel(verticalLayoutWidget);
        label_5->setObjectName(QString::fromUtf8("label_5"));

        verticalLayout->addWidget(label_5);

        label = new QLabel(verticalLayoutWidget);
        label->setObjectName(QString::fromUtf8("label"));

        verticalLayout->addWidget(label);

        label_4 = new QLabel(verticalLayoutWidget);
        label_4->setObjectName(QString::fromUtf8("label_4"));

        verticalLayout->addWidget(label_4);

        label_3 = new QLabel(verticalLayoutWidget);
        label_3->setObjectName(QString::fromUtf8("label_3"));

        verticalLayout->addWidget(label_3);

        label_7 = new QLabel(verticalLayoutWidget);
        label_7->setObjectName(QString::fromUtf8("label_7"));

        verticalLayout->addWidget(label_7);

        verticalLayoutWidget_2 = new QWidget(frame);
        verticalLayoutWidget_2->setObjectName(QString::fromUtf8("verticalLayoutWidget_2"));
        verticalLayoutWidget_2->setGeometry(QRect(250, 40, 191, 241));
        verticalLayout_2 = new QVBoxLayout(verticalLayoutWidget_2);
        verticalLayout_2->setObjectName(QString::fromUtf8("verticalLayout_2"));
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        name = new QLineEdit(verticalLayoutWidget_2);
        name->setObjectName(QString::fromUtf8("name"));

        verticalLayout_2->addWidget(name);

        birthdate = new QLineEdit(verticalLayoutWidget_2);
        birthdate->setObjectName(QString::fromUtf8("birthdate"));

        verticalLayout_2->addWidget(birthdate);

        phone = new QLineEdit(verticalLayoutWidget_2);
        phone->setObjectName(QString::fromUtf8("phone"));

        verticalLayout_2->addWidget(phone);

        email = new QLineEdit(verticalLayoutWidget_2);
        email->setObjectName(QString::fromUtf8("email"));

        verticalLayout_2->addWidget(email);

        mailing = new QLineEdit(verticalLayoutWidget_2);
        mailing->setObjectName(QString::fromUtf8("mailing"));

        verticalLayout_2->addWidget(mailing);

        dLicense = new QLineEdit(verticalLayoutWidget_2);
        dLicense->setObjectName(QString::fromUtf8("dLicense"));

        verticalLayout_2->addWidget(dLicense);

        cardNumber = new QLineEdit(verticalLayoutWidget_2);
        cardNumber->setObjectName(QString::fromUtf8("cardNumber"));

        verticalLayout_2->addWidget(cardNumber);

        horizontalLayoutWidget = new QWidget(frame);
        horizontalLayoutWidget->setObjectName(QString::fromUtf8("horizontalLayoutWidget"));
        horizontalLayoutWidget->setGeometry(QRect(30, 290, 191, 31));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget);
        horizontalLayout->setObjectName(QString::fromUtf8("horizontalLayout"));
        horizontalLayout->setContentsMargins(0, 0, 0, 0);
        confirm = new QPushButton(horizontalLayoutWidget);
        confirm->setObjectName(QString::fromUtf8("confirm"));

        horizontalLayout->addWidget(confirm);

        cancelAction = new QPushButton(horizontalLayoutWidget);
        cancelAction->setObjectName(QString::fromUtf8("cancelAction"));

        horizontalLayout->addWidget(cancelAction);

        label_8 = new QLabel(frame);
        label_8->setObjectName(QString::fromUtf8("label_8"));
        label_8->setGeometry(QRect(30, 10, 181, 21));
        add_customer->setCentralWidget(centralwidget);
        menubar = new QMenuBar(add_customer);
        menubar->setObjectName(QString::fromUtf8("menubar"));
        menubar->setGeometry(QRect(0, 0, 640, 21));
        add_customer->setMenuBar(menubar);
        statusbar = new QStatusBar(add_customer);
        statusbar->setObjectName(QString::fromUtf8("statusbar"));
        add_customer->setStatusBar(statusbar);

        retranslateUi(add_customer);

        QMetaObject::connectSlotsByName(add_customer);
    } // setupUi

    void retranslateUi(QMainWindow *add_customer)
    {
        add_customer->setWindowTitle(QCoreApplication::translate("add_customer", "MainWindow", nullptr));
        label_6->setText(QCoreApplication::translate("add_customer", "Name: ", nullptr));
        label_2->setText(QCoreApplication::translate("add_customer", "Date of Birth:", nullptr));
        label_5->setText(QCoreApplication::translate("add_customer", "Phone Number:", nullptr));
        label->setText(QCoreApplication::translate("add_customer", "E-Mail Address:", nullptr));
        label_4->setText(QCoreApplication::translate("add_customer", "Mailing Address:", nullptr));
        label_3->setText(QCoreApplication::translate("add_customer", "Driver's License Number:", nullptr));
        label_7->setText(QCoreApplication::translate("add_customer", "Debit/Credit Card Number: ", nullptr));
        confirm->setText(QCoreApplication::translate("add_customer", "Add", nullptr));
        cancelAction->setText(QCoreApplication::translate("add_customer", "Cancel", nullptr));
        label_8->setText(QCoreApplication::translate("add_customer", "Add Customer", nullptr));
    } // retranslateUi

};

namespace Ui {
    class add_customer: public Ui_add_customer {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ADD_CUSTOMER_H

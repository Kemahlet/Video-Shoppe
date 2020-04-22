/********************************************************************************
** Form generated from reading UI file 'view_inventory.ui'
**
** Created by: Qt User Interface Compiler version 5.14.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_VIEW_INVENTORY_H
#define UI_VIEW_INVENTORY_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QComboBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QScrollArea>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_view_inventory
{
public:
    QWidget *centralwidget;
    QWidget *verticalLayoutWidget;
    QVBoxLayout *verticalLayout;
    QLabel *label;
    QLineEdit *lineEdit;
    QHBoxLayout *horizontalLayout;
    QLabel *label_2;
    QComboBox *comboBox;
    QScrollArea *scrollArea;
    QWidget *scrollAreaWidgetContents;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *view_inventory)
    {
        if (view_inventory->objectName().isEmpty())
            view_inventory->setObjectName(QString::fromUtf8("view_inventory"));
        view_inventory->resize(640, 480);
        centralwidget = new QWidget(view_inventory);
        centralwidget->setObjectName(QString::fromUtf8("centralwidget"));
        verticalLayoutWidget = new QWidget(centralwidget);
        verticalLayoutWidget->setObjectName(QString::fromUtf8("verticalLayoutWidget"));
        verticalLayoutWidget->setGeometry(QRect(20, 10, 381, 69));
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
        label_2 = new QLabel(verticalLayoutWidget);
        label_2->setObjectName(QString::fromUtf8("label_2"));

        horizontalLayout->addWidget(label_2);

        comboBox = new QComboBox(verticalLayoutWidget);
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->addItem(QString());
        comboBox->setObjectName(QString::fromUtf8("comboBox"));

        horizontalLayout->addWidget(comboBox);


        verticalLayout->addLayout(horizontalLayout);

        scrollArea = new QScrollArea(centralwidget);
        scrollArea->setObjectName(QString::fromUtf8("scrollArea"));
        scrollArea->setGeometry(QRect(20, 110, 391, 311));
        scrollArea->setWidgetResizable(true);
        scrollAreaWidgetContents = new QWidget();
        scrollAreaWidgetContents->setObjectName(QString::fromUtf8("scrollAreaWidgetContents"));
        scrollAreaWidgetContents->setGeometry(QRect(0, 0, 389, 309));
        scrollArea->setWidget(scrollAreaWidgetContents);
        view_inventory->setCentralWidget(centralwidget);
        menubar = new QMenuBar(view_inventory);
        menubar->setObjectName(QString::fromUtf8("menubar"));
        menubar->setGeometry(QRect(0, 0, 640, 21));
        view_inventory->setMenuBar(menubar);
        statusbar = new QStatusBar(view_inventory);
        statusbar->setObjectName(QString::fromUtf8("statusbar"));
        view_inventory->setStatusBar(statusbar);

        retranslateUi(view_inventory);

        QMetaObject::connectSlotsByName(view_inventory);
    } // setupUi

    void retranslateUi(QMainWindow *view_inventory)
    {
        view_inventory->setWindowTitle(QCoreApplication::translate("view_inventory", "MainWindow", nullptr));
        label->setText(QCoreApplication::translate("view_inventory", "Search DVDS...", nullptr));
        label_2->setText(QCoreApplication::translate("view_inventory", "Search by:", nullptr));
        comboBox->setItemText(0, QCoreApplication::translate("view_inventory", "Search All", nullptr));
        comboBox->setItemText(1, QCoreApplication::translate("view_inventory", "Title", nullptr));
        comboBox->setItemText(2, QCoreApplication::translate("view_inventory", "Actor", nullptr));
        comboBox->setItemText(3, QCoreApplication::translate("view_inventory", "Director", nullptr));
        comboBox->setItemText(4, QCoreApplication::translate("view_inventory", "Genre", nullptr));
        comboBox->setItemText(5, QCoreApplication::translate("view_inventory", "Rating", nullptr));

    } // retranslateUi

};

namespace Ui {
    class view_inventory: public Ui_view_inventory {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_VIEW_INVENTORY_H

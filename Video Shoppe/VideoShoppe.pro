
QT       += core gui sql

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

CONFIG += c++11

# The following define makes your compiler emit warnings if you use
# any Qt feature that has been marked deprecated (the exact warnings
# depend on your compiler). Please consult the documentation of the
# deprecated API in order to know how to port your code away from it.
DEFINES += QT_DEPRECATED_WARNINGS

# You can also make your code fail to compile if it uses deprecated APIs.
# In order to do so, uncomment the following line.
# You can also select to disable deprecated APIs only up to a certain version of Qt.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0

SOURCES += \
    add_customer.cpp \
    add_employee.cpp \
    clerk_page.cpp \
    database.cpp \
    main.cpp \
    mainwindow.cpp \
    manager_page.cpp \
    return_dvd.cpp \
    view_inventory.cpp \

HEADERS += \
    add_customer.h \
    add_employee.h \
    clerk_page.h \
    database.h \
    mainwindow.h \
    manager_page.h \
    return_dvd.h \
    view_inventory.h

FORMS += \
    add_customer.ui \
    add_employee.ui \
    clerk_page.ui \
    mainwindow.ui \
    manager_page.ui \
    return_dvd.ui \
    view_inventory.ui


# Default rules for deployment.
qnx: target.path = /tmp/$${TARGET}/bin
else: unix:!android: target.path = /opt/$${TARGET}/bin
!isEmpty(target.path): INSTALLS += target

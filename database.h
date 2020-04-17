#ifndef DATABASE_H
#define DATABASE_H

#include <QSqlDatabase>
#include <QSqlQuery>

class Database
{
public:Database();
    ~Database();
    bool Connect(const QString dbname);
    bool Disconnect();
    QSqlQuery Query(QString q);
    QSqlDatabase db;
    bool dbstate;

private:
};

namespace MySQLDB {
    class DB : public Database {};
}

#endif // DATABASE_H

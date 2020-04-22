#include "database.h"


Database::Database()
{

}
Database::~Database()
{
    Disconnect();
}

bool Database::Connect(const QString dbname)
{

    if (!this->db.isOpen())
    {
        this->db = QSqlDatabase::addDatabase("QMYSQL");
        this->db.setDatabaseName(dbname);

        if (!this->db.open())
        {
          return false;
        }
        else
        {
          return true;
        }
    }
    else
    {
        return false;
    }
}

bool Database::Disconnect()
{
    if (this->db.isOpen())
    {
        this->db.close();
        return true;
    }
    else
    {
        return false;
    }
}

QSqlQuery Query(QString q)
{
    QSqlQuery query(q);
    return query;
}

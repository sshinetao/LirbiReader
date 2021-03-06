package com.foobnix.dao2;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOKMARK".
*/
public class BookmarkDao extends AbstractDao<Bookmark, Long> {

    public static final String TABLENAME = "BOOKMARK";

    /**
     * Properties of entity Bookmark.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Path = new Property(1, String.class, "path", false, "PATH");
        public final static Property Text = new Property(2, String.class, "text", false, "TEXT");
        public final static Property Page = new Property(3, Integer.class, "page", false, "PAGE");
        public final static Property Time = new Property(4, Long.class, "time", false, "TIME");
        public final static Property Type = new Property(5, Integer.class, "type", false, "TYPE");
        public final static Property Color = new Property(6, String.class, "color", false, "COLOR");
    }


    public BookmarkDao(DaoConfig config) {
        super(config);
    }
    
    public BookmarkDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOKMARK\" (" + //
                "\"ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"PATH\" TEXT," + // 1: path
                "\"TEXT\" TEXT," + // 2: text
                "\"PAGE\" INTEGER," + // 3: page
                "\"TIME\" INTEGER," + // 4: time
                "\"TYPE\" INTEGER," + // 5: type
                "\"COLOR\" TEXT);"); // 6: color
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOKMARK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Bookmark entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(2, path);
        }
 
        String text = entity.getText();
        if (text != null) {
            stmt.bindString(3, text);
        }
 
        Integer page = entity.getPage();
        if (page != null) {
            stmt.bindLong(4, page);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(5, time);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(6, type);
        }
 
        String color = entity.getColor();
        if (color != null) {
            stmt.bindString(7, color);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Bookmark entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(2, path);
        }
 
        String text = entity.getText();
        if (text != null) {
            stmt.bindString(3, text);
        }
 
        Integer page = entity.getPage();
        if (page != null) {
            stmt.bindLong(4, page);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(5, time);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(6, type);
        }
 
        String color = entity.getColor();
        if (color != null) {
            stmt.bindString(7, color);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Bookmark readEntity(Cursor cursor, int offset) {
        Bookmark entity = new Bookmark( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // path
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // text
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // page
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // time
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // type
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // color
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Bookmark entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setText(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPage(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setTime(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setColor(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Bookmark entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Bookmark entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Bookmark entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

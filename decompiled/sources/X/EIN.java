package X;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.RoomDatabaseKt__RoomDatabaseKt;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class EIN {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    public boolean allowMainThreadQueries;
    public AbstractC6588EIg autoCloser;
    public EIQ configuration;
    public EIO connectionManager;
    public C3UX coroutineScope;
    public Executor internalQueryExecutor;
    public EIR internalTracker;
    public Executor internalTransactionExecutor;
    public List<? extends AbstractC6555EEr> mCallbacks;
    public volatile EI3 mDatabase;
    public C78T transactionContext;
    public final EIU closeBarrier = new EIU(new EZ6(this, 2));
    public final ThreadLocal<C78T> suspendingTransactionContext = new ThreadLocal<>();
    public final Map<C9uG<?>, Object> typeConverters = C3cG.A0j();
    public boolean useTempTrackingTable = true;

    public static C5322DgG A00(Object obj, int i) {
        return new C5322DgG(null, new C7589F5c(obj, i));
    }

    public static final EEV createConnectionManager$lambda$2(EIN ein, EIQ eiq) {
        C7384Etj.A0Y(eiq, 1);
        ein.createOpenHelper(eiq);
        throw F60.createAndThrow();
    }

    @Deprecated(level = Hs1.A02, message = "This property is always null and will be removed in a future version.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(level = Hs1.A02, message = "This property is always null and will be removed in a future version.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    private final /* synthetic */ <T extends EEV> T unwrapOpenHelper(EEV eev) {
        if (eev == null) {
            return null;
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public abstract void clearAllTables();

    public EI1 compileStatement(String str) throws SQLException {
        C7384Etj.A0Y(str, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        SQLiteStatement sQLiteStatementCompileStatement = ((EHO) getOpenHelper().AMs()).A00.compileStatement(str);
        C7384Etj.A0U(sQLiteStatementCompileStatement);
        return new EI0(sQLiteStatementCompileStatement);
    }

    public List<AbstractC6554EEq> createAutoMigrations(Map<C9uG<? extends EN5>, ? extends EN5> map) {
        C7384Etj.A0Y(map, 0);
        LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            linkedHashMapA0I.put(C9uT.A01((C9uG) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMapA0I);
    }

    public final EIO createConnectionManager$room_runtime(EIQ eiq) {
        C7384Etj.A0Y(eiq, 0);
        try {
            EIT eit = (EIT) createOpenDelegate();
            if (eit != null) {
                return new EIO(eiq, eit, new C7Bf(this));
            }
        } catch (C7500EyF unused) {
        }
        new EIO(eiq, new C7590F5d(this, 6));
        throw F60.createAndThrow();
    }

    public abstract EIR createInvalidationTracker();

    public abstract InterfaceC6590EIi createOpenDelegate();

    public final <T> T getTypeConverter(C9uG<T> c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        T t = (T) this.typeConverters.get(c9uG);
        C7384Etj.A0Z(t, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        throw X.C60O.A0i("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010f, code lost:
    
        r4[r9] = true;
        addTypeConverter$room_runtime(r2, r6.get(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r4[r2] = true;
        r7.put(r3, r9.get(r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(X.EIQ r11) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIN.init(X.EIQ):void");
    }

    public final void internalInitInvalidationTracker(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIR invalidationTracker = getInvalidationTracker();
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.A03;
        EIK eikAYO = ejv.AYO("PRAGMA query_only");
        try {
            eikAYO.AgN();
            boolean zACx = eikAYO.ACx(0);
            eikAYO.close();
            if (!zACx) {
                EIW.A00(ejv, "PRAGMA temp_store = MEMORY");
                EIW.A00(ejv, "PRAGMA recursive_triggers = 1");
                EIW.A00(ejv, "DROP TABLE IF EXISTS room_table_modification_log");
                EIW.A00(ejv, triggerBasedInvalidationTracker.A05 ? "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)" : AbstractC2159Azp.A0z("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                EIV eiv = triggerBasedInvalidationTracker.A01;
                ReentrantLock reentrantLock = eiv.A00;
                reentrantLock.lock();
                try {
                    eiv.A05 = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (invalidationTracker.A04) {
                C5297Dfd c5297Dfd = invalidationTracker.A01;
                if (c5297Dfd != null) {
                    Intent intent = invalidationTracker.A00;
                    if (intent == null) {
                        throw BV4.A0U();
                    }
                    if (c5297Dfd.A08.compareAndSet(true, false)) {
                        c5297Dfd.A02.bindService(intent, c5297Dfd.A03, 1);
                        EIR eir = c5297Dfd.A05;
                        C5296Dfc c5296Dfc = c5297Dfd.A06;
                        C7384Etj.A0Y(c5296Dfc, 0);
                        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2 = eir.A03;
                        HxE<String[], int[]> hxEA05 = triggerBasedInvalidationTracker2.A05(c5296Dfc.A00);
                        String[] strArr = hxEA05.first;
                        int[] iArr = hxEA05.second;
                        C7550F2v c7550F2v = new C7550F2v(c5296Dfc, iArr, strArr);
                        ReentrantLock reentrantLock2 = eir.A07;
                        reentrantLock2.lock();
                        try {
                            Map<C5296Dfc, C7550F2v> map = eir.A05;
                            C7550F2v c7550F2vPut = map.containsKey(c5296Dfc) ? (C7550F2v) AbstractC2258BHp.A0L(c5296Dfc, map) : map.put(c5296Dfc, c7550F2v);
                            reentrantLock2.unlock();
                            if (c7550F2vPut == null) {
                                C7384Etj.A0Y(iArr, 0);
                                triggerBasedInvalidationTracker2.A01.A00(iArr);
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Hsg.A00(eikAYO, th2);
                throw th3;
            }
        }
    }

    public final void performClear(boolean z, String... strArr) {
        C7384Etj.A0Y(strArr, 1);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        FXQ.A00(new RoomDatabase$performClear$1(this, null, strArr, z));
    }

    public final Cursor query(InterfaceC6578EHw interfaceC6578EHw) {
        C7384Etj.A0Y(interfaceC6578EHw, 0);
        return query(interfaceC6578EHw, (CancellationSignal) null);
    }

    public static void A01(Class cls, Object obj, AbstractMap abstractMap) {
        abstractMap.put(new C0861A6i(cls), obj);
    }

    private final boolean isThreadInSuspendingTransaction() {
        C78T c78t = this.suspendingTransactionContext.get();
        return (c78t == null || c78t.get(C06757Bd.A01) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        C3UX c3ux = this.coroutineScope;
        if (c3ux == null) {
            C7384Etj.A0b("coroutineScope");
            throw F60.createAndThrow();
        }
        Hxb.A03(null, c3ux);
        C5297Dfd c5297Dfd = getInvalidationTracker().A01;
        if (c5297Dfd != null && BV4.A1V(c5297Dfd.A08)) {
            EIR eir = c5297Dfd.A05;
            C5296Dfc c5296Dfc = c5297Dfd.A06;
            C7384Etj.A0Y(c5296Dfc, 0);
            ReentrantLock reentrantLock = eir.A07;
            reentrantLock.lock();
            try {
                C7550F2v c7550F2vRemove = eir.A05.remove(c5296Dfc);
                if (c7550F2vRemove != null) {
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = eir.A03;
                    if (triggerBasedInvalidationTracker.A01.A01(c7550F2vRemove.A02)) {
                        FXQ.A00(new EZE(eir, null, 0));
                    }
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = c5297Dfd.A01;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.Ahj(c5297Dfd.A04, c5297Dfd.A00);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                c5297Dfd.A02.unbindService(c5297Dfd.A03);
            } finally {
                reentrantLock.unlock();
            }
        }
        EIO eio = this.connectionManager;
        if (eio == null) {
            C7384Etj.A0b("connectionManager");
            throw F60.createAndThrow();
        }
        eio.A05.close();
        EEV eev = eio.A06;
        if (eev != null) {
            eev.close();
        }
    }

    public static /* synthetic */ Cursor query$default(EIN ein, InterfaceC6578EHw interfaceC6578EHw, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return ein.query(interfaceC6578EHw, cancellationSignal);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void close() {
        boolean zCompareAndSet;
        EIU eiu = this.closeBarrier;
        synchronized (eiu) {
            zCompareAndSet = eiu.A01.compareAndSet(false, true);
        }
        if (zCompareAndSet) {
            while (eiu.A02.get() != 0) {
            }
            eiu.A03.invoke();
            eiu.A00.compareAndSet(false, true);
        }
    }

    @Deprecated(message = "No longer implemented by generated")
    public EEV createOpenHelper(EIQ eiq) {
        throw new C7500EyF("An operation is not implemented.");
    }

    public final EIU getCloseBarrier$room_runtime() {
        return this.closeBarrier;
    }

    public final C3UX getCoroutineScope() {
        C3UX c3ux = this.coroutineScope;
        if (c3ux != null) {
            return c3ux;
        }
        C7384Etj.A0b("coroutineScope");
        throw F60.createAndThrow();
    }

    public final InterfaceC6586EIe getDriver() {
        EIQ eiq = this.configuration;
        if (eiq == null) {
            C7384Etj.A0b("configuration");
            throw F60.createAndThrow();
        }
        InterfaceC6586EIe interfaceC6586EIe = eiq.A05;
        if (interfaceC6586EIe != null) {
            return interfaceC6586EIe;
        }
        throw C3cG.A0Q("No SQLiteDriver was configured with Room.");
    }

    public EIR getInvalidationTracker() {
        EIR eir = this.internalTracker;
        if (eir != null) {
            return eir;
        }
        C7384Etj.A0b("internalTracker");
        throw F60.createAndThrow();
    }

    public EEV getOpenHelper() {
        EIO eio = this.connectionManager;
        if (eio == null) {
            C7384Etj.A0b("connectionManager");
            throw F60.createAndThrow();
        }
        EEV eev = eio.A06;
        if (eev != null) {
            return eev;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final String getPath() {
        EIQ eiq = this.configuration;
        if (eiq == null) {
            C7384Etj.A0b("configuration");
            throw F60.createAndThrow();
        }
        String str = eiq.A0A;
        if (str != null) {
            return eiq.A02.getDatabasePath(str).getPath();
        }
        return null;
    }

    public final C78T getQueryContext() {
        C3UX c3ux = this.coroutineScope;
        if (c3ux != null) {
            return c3ux.AEA();
        }
        C7384Etj.A0b("coroutineScope");
        throw F60.createAndThrow();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        C7384Etj.A0b("internalQueryExecutor");
        throw F60.createAndThrow();
    }

    @Deprecated(message = "No longer implemented by generated")
    public Set<Class<? extends EN5>> getRequiredAutoMigrationSpecs() {
        return A3q.A00;
    }

    public final ThreadLocal<C78T> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    public final C78T getTransactionContext$room_runtime() {
        C78T c78t = this.transactionContext;
        if (c78t != null) {
            return c78t;
        }
        C7384Etj.A0b("transactionContext");
        throw F60.createAndThrow();
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        C7384Etj.A0b("internalTransactionExecutor");
        throw F60.createAndThrow();
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        EIO eio = this.connectionManager;
        if (eio != null) {
            return eio.A06 != null;
        }
        C7384Etj.A0b("connectionManager");
        throw F60.createAndThrow();
    }

    public boolean isOpen() {
        EIO eio = this.connectionManager;
        if (eio == null) {
            C7384Etj.A0b("connectionManager");
            throw F60.createAndThrow();
        }
        EI3 ei3 = eio.A00;
        if (ei3 != null) {
            return ((EHO) ei3).A00.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal$room_runtime() {
        EIO eio = this.connectionManager;
        if (eio == null) {
            C7384Etj.A0b("connectionManager");
            throw F60.createAndThrow();
        }
        EI3 ei3 = eio.A00;
        if (ei3 != null) {
            return ((EHO) ei3).A00.isOpen();
        }
        return false;
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SQLiteDatabase sQLiteDatabase = ((EHO) getOpenHelper().AMs()).A00;
        if (!sQLiteDatabase.inTransaction()) {
            FXQ.A00(new C8902FtJ(getInvalidationTracker(), null, 1));
        }
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            sQLiteDatabase.beginTransactionNonExclusive();
        } else {
            sQLiteDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        ((EHO) getOpenHelper().AMs()).A00.endTransaction();
        if (inTransaction()) {
            return;
        }
        EIR invalidationTracker = getInvalidationTracker();
        invalidationTracker.A03.A06(invalidationTracker.A09, invalidationTracker.A08);
    }

    private final <T> T runInTransaction(Function0<? extends T> function0) {
        if (!inCompatibilityMode()) {
            return (T) DBUtil__DBUtil_androidKt.A01(this, new C7590F5d(function0, 7), false, true);
        }
        beginTransaction();
        try {
            T tInvoke = function0.invoke();
            setTransactionSuccessful();
            return tInvoke;
        } finally {
            internalEndTransaction();
        }
    }

    public static final Unit runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return Unit.INSTANCE;
    }

    public final void addTypeConverter$room_runtime(C9uG<?> c9uG, Object obj) {
        AnonymousClass003.A0u(c9uG, obj);
        this.typeConverters.put(c9uG, obj);
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode() && !inTransaction() && isThreadInSuspendingTransaction()) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        internalEndTransaction();
    }

    @Deprecated(message = "No longer implemented by generated")
    public List<AbstractC6554EEq> getAutoMigrations(Map<Class<? extends EN5>, EN5> map) {
        return C0881AGi.A00;
    }

    public Set<C9uG<? extends EN5>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends EN5>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayListA0i = AnonymousClass003.A0i(requiredAutoMigrationSpecs);
        for (Class<? extends EN5> cls : requiredAutoMigrationSpecs) {
            C7384Etj.A0Y(cls, 0);
            arrayListA0i.add(new C0861A6i(cls));
        }
        return AbstractC0878AGe.A0g(arrayListA0i);
    }

    public Map<C9uG<?>, List<C9uG<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(setEntrySet));
        for (Map.Entry<Class<?>, List<Class<?>>> entry : setEntrySet) {
            Class<?> key = entry.getKey();
            List<Class<?>> value = entry.getValue();
            C7384Etj.A0Y(key, 0);
            C0861A6i c0861A6i = new C0861A6i(key);
            ArrayList arrayList = new ArrayList(Hr7.A1D(value, 10));
            for (Class<?> cls : value) {
                C7384Etj.A0Y(cls, 0);
                arrayList.add(new C0861A6i(cls));
            }
            linkedHashMap.put(c0861A6i, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<C9uG<?>, List<C9uG<?>>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return AGH.A0E();
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && ((EHO) getOpenHelper().AMs()).A00.inTransaction();
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        ((EHO) getOpenHelper().AMs()).A00.setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    public final <R> Object useConnection(boolean z, G0V<? super EJA, ? super HtJ<? super R>, ? extends Object> g0v, HtJ<? super R> htJ) {
        RoomDatabaseKt__RoomDatabaseKt.A00(this);
        EIO eio = this.connectionManager;
        if (eio != null) {
            return eio.A05.AiC(z, g0v, htJ);
        }
        C7384Etj.A0b("connectionManager");
        throw F60.createAndThrow();
    }

    @Deprecated(message = "No longer called by generated implementation")
    public <T> T getTypeConverter(Class<T> cls) {
        C7384Etj.A0Y(cls, 0);
        return (T) this.typeConverters.get(new C0861A6i(cls));
    }

    @Deprecated(message = "No longer called by generated")
    public void internalInitInvalidationTracker(EI3 ei3) {
        C7384Etj.A0Y(ei3, 0);
        internalInitInvalidationTracker(new EI7(ei3));
    }

    public Cursor query(final InterfaceC6578EHw interfaceC6578EHw, CancellationSignal cancellationSignal) {
        C7384Etj.A0Y(interfaceC6578EHw, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        EI3 ei3AMs = getOpenHelper().AMs();
        if (cancellationSignal != null) {
            Cursor cursorRawQueryWithFactory = ((EHO) ei3AMs).A00.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.EHy
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    InterfaceC6578EHw interfaceC6578EHw2 = interfaceC6578EHw;
                    String[] strArr = EHO.A03;
                    C7384Etj.A0X(sQLiteQuery);
                    interfaceC6578EHw2.A5H(new C6581EHz(sQLiteQuery));
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, interfaceC6578EHw.AKr(), EHO.A04, null, cancellationSignal);
            C7384Etj.A0U(cursorRawQueryWithFactory);
            return cursorRawQueryWithFactory;
        }
        return ei3AMs.AYu(interfaceC6578EHw);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        C7384Etj.A0Y(callable, 0);
        return (V) runInTransaction(new C7589F5c(callable, 6));
    }

    public Cursor query(String str, Object[] objArr) {
        C7384Etj.A0Y(str, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().AMs().AYu(new EI4(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        runInTransaction(new C7589F5c(runnable, 5));
    }
}

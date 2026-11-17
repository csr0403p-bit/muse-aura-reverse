package X;

import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EJY<T> {
    public static final long A01(EJV ejv) {
        if (EJZ.A00(ejv) == 0) {
            return -1L;
        }
        EIK eikAYO = ejv.AYO("SELECT last_insert_rowid()");
        try {
            eikAYO.AgN();
            long j = eikAYO.getLong(0);
            eikAYO.close();
            return j;
        } finally {
        }
    }

    public abstract void bind(EIK eik, T t);

    public abstract String createQuery();

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(EJV ejv, T[] tArr) {
        C7384Etj.A0Y(ejv, 0);
        if (tArr != null) {
            EIK eikA02 = A02(this, ejv);
            try {
                F3E f3e = new F3E(tArr);
                while (f3e.hasNext()) {
                    Object next = f3e.next();
                    if (next != null) {
                        bind(eikA02, next);
                        eikA02.AgN();
                        eikA02.reset();
                    }
                }
                if (eikA02 != null) {
                    eikA02.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Hsg.A00(eikA02, th);
                    throw th2;
                }
            }
        }
    }

    public final long insertAndReturnId(EJV ejv, T t) {
        C7384Etj.A0Y(ejv, 0);
        if (t == null) {
            return -1L;
        }
        EIK eikA02 = A02(this, ejv);
        try {
            bind(eikA02, t);
            eikA02.AgN();
            eikA02.close();
            return A01(ejv);
        } finally {
        }
    }

    public final long[] insertAndReturnIdsArray(EJV ejv, Collection<? extends T> collection) {
        C7384Etj.A0Y(ejv, 0);
        if (collection == null) {
            return new long[0];
        }
        EIK eikA02 = A02(this, ejv);
        try {
            int size = collection.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                Object objA0E = AbstractC0878AGe.A0E(collection, i);
                jArr[i] = objA0E != null ? A00(this, ejv, eikA02, objA0E) : -1L;
            }
            if (eikA02 == null) {
                return jArr;
            }
            eikA02.close();
            return jArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Hsg.A00(eikA02, th);
                throw th2;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(EJV ejv, Collection<? extends T> collection) {
        C7384Etj.A0Y(ejv, 0);
        if (collection == null) {
            return new Long[0];
        }
        EIK eikA02 = A02(this, ejv);
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                Object objA0E = AbstractC0878AGe.A0E(collection, i);
                lArr[i] = Long.valueOf(objA0E != null ? A00(this, ejv, eikA02, objA0E) : -1L);
            }
            if (eikA02 == null) {
                return lArr;
            }
            eikA02.close();
            return lArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Hsg.A00(eikA02, th);
                throw th2;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(EJV ejv, Collection<? extends T> collection) {
        C7384Etj.A0Y(ejv, 0);
        if (collection == null) {
            return C0881AGi.A00;
        }
        AII aiiA17 = AIM.A17();
        EIK eikA02 = A02(this, ejv);
        try {
            for (T t : collection) {
                if (t != null) {
                    BV6.A1R(aiiA17, A00(this, ejv, eikA02, t));
                } else {
                    BV6.A1R(aiiA17, -1L);
                }
            }
            if (eikA02 != null) {
                eikA02.close();
            }
            return AIM.A18(aiiA17);
        } finally {
        }
    }

    public static long A00(EJY ejy, EJV ejv, EIK eik, Object obj) {
        ejy.bind(eik, obj);
        eik.AgN();
        eik.reset();
        return A01(ejv);
    }

    public static EIK A02(EJY ejy, EJV ejv) {
        return ejv.AYO(ejy.createQuery());
    }

    public final void insert(EJV ejv, Iterable<? extends T> iterable) {
        C7384Etj.A0Y(ejv, 0);
        if (iterable != null) {
            EIK eikA02 = A02(this, ejv);
            try {
                for (T t : iterable) {
                    if (t != null) {
                        bind(eikA02, t);
                        eikA02.AgN();
                        eikA02.reset();
                    }
                }
                if (eikA02 != null) {
                    eikA02.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Hsg.A00(eikA02, th);
                    throw th2;
                }
            }
        }
    }

    public final long[] insertAndReturnIdsArray(EJV ejv, T[] tArr) {
        long jA00;
        C7384Etj.A0Y(ejv, 0);
        if (tArr == null) {
            return new long[0];
        }
        EIK eikA02 = A02(this, ejv);
        try {
            int length = tArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                T t = tArr[i];
                if (t != null) {
                    jA00 = A00(this, ejv, eikA02, t);
                } else {
                    jA00 = -1;
                }
                jArr[i] = jA00;
            }
            if (eikA02 == null) {
                return jArr;
            }
            eikA02.close();
            return jArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Hsg.A00(eikA02, th);
                throw th2;
            }
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(EJV ejv, T[] tArr) {
        long jA00;
        C7384Etj.A0Y(ejv, 0);
        if (tArr == null) {
            return new Long[0];
        }
        EIK eikA02 = A02(this, ejv);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                T t = tArr[i];
                if (t != null) {
                    jA00 = A00(this, ejv, eikA02, t);
                } else {
                    jA00 = -1;
                }
                lArr[i] = Long.valueOf(jA00);
            }
            if (eikA02 == null) {
                return lArr;
            }
            eikA02.close();
            return lArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Hsg.A00(eikA02, th);
                throw th2;
            }
        }
    }

    public final List<Long> insertAndReturnIdsList(EJV ejv, T[] tArr) {
        C7384Etj.A0Y(ejv, 0);
        if (tArr == null) {
            return C0881AGi.A00;
        }
        AII aiiA17 = AIM.A17();
        EIK eikA02 = A02(this, ejv);
        try {
            for (T t : tArr) {
                if (t != null) {
                    BV6.A1R(aiiA17, A00(this, ejv, eikA02, t));
                } else {
                    BV6.A1R(aiiA17, -1L);
                }
            }
            if (eikA02 != null) {
                eikA02.close();
            }
            return AIM.A18(aiiA17);
        } finally {
        }
    }

    public final void insert(EJV ejv, T t) {
        C7384Etj.A0Y(ejv, 0);
        if (t != null) {
            EIK eikA02 = A02(this, ejv);
            try {
                bind(eikA02, t);
                eikA02.AgN();
                eikA02.close();
            } finally {
            }
        }
    }
}

package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.De3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5240De3<T> {
    public static final String MISSING_PAGINATION_KEY = "MISSING_PAGINATION_KEY";
    public static volatile G0U executorProviderForTest;
    public final boolean hasNextPage;
    public final boolean hasPreviousPage;
    public final boolean isLoadingNext;
    public final boolean isLoadingPrevious;
    public boolean isPandoBacked;
    public final ImmutableList<T> list;
    public final String nextPageUUID;
    public final String paginationKey;
    public final String paginationLoadErrorMsg;
    public final boolean paginationLoadHadError;
    public final String previousPageUUID;
    public final String schema;

    public static NullPointerException A00(InterfaceC7542F0w interfaceC7542F0w, Object obj) {
        C7384Etj.A0Y(obj, 5);
        A02(interfaceC7542F0w);
        return new NullPointerException("loadNextPage");
    }

    public static void A01(InterfaceC7542F0w interfaceC7542F0w) {
        C7384Etj.A0Y(interfaceC7542F0w, 0);
        A02(interfaceC7542F0w);
    }

    public final InterfaceC5106DYe loadPreviousPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, String str, DYF dyf) {
        AnonymousClass005.A11(interfaceC7542F0w, executor, str, 0);
        A02(interfaceC7542F0w);
        throw BV4.A0a("loadPreviousPage");
    }

    public final <R> C5240De3<R> map(G0U<? super T, ? extends R> g0u) {
        C7384Etj.A0Y(g0u, 0);
        String str = this.paginationKey;
        ImmutableList<T> immutableList = this.list;
        ArrayList arrayListA0i = AnonymousClass003.A0i(immutableList);
        Iterator<T> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(g0u.invoke(it.next()));
        }
        C5240De3<R> c5240De3 = new C5240De3<>(str, ImmutableList.copyOf((Collection) arrayListA0i), this.hasPreviousPage, this.hasNextPage, this.isLoadingPrevious, this.isLoadingNext, this.previousPageUUID, this.nextPageUUID, this.schema, this.paginationLoadHadError, this.paginationLoadErrorMsg);
        c5240De3.isPandoBacked = this.isPandoBacked;
        return c5240De3;
    }

    public static final void A02(InterfaceC7542F0w interfaceC7542F0w) {
        C3628CaH c3628CaH;
        G0U g0u = executorProviderForTest;
        if (g0u != null) {
            g0u.invoke(interfaceC7542F0w);
        }
        C5249DeE c5249DeEA00 = C5249DeE.A00();
        AbstractC5257DeM.get(C4JM.A00());
        Integer num = new De5(-1).A00;
        if (num.intValue() == -1) {
            num = null;
        }
        if (c5249DeEA00 == null) {
            C7384Etj.A0U(AbstractC5257DeM.get(C4JM.A00()).AK0());
        }
        if (num == null) {
            c3628CaH = new C3628CaH(null);
        } else {
            int iIntValue = num.intValue();
            c3628CaH = new C3628CaH(new C3626Ca9(c5249DeEA00 != null ? new C5244De9(c5249DeEA00, interfaceC7542F0w, iIntValue) : new C5244De9(interfaceC7542F0w, iIntValue)));
        }
        C7384Etj.A0U(c3628CaH.get());
    }

    public static /* synthetic */ InterfaceC5106DYe loadNextPage$default(C5240De3 c5240De3, InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, int i2, boolean z, String str, DYF dyf, AbstractC5243De8 abstractC5243De8, int i3, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: loadNextPage");
        }
        if ((i3 & 32) != 0 && (str = c5240De3.nextPageUUID) == null) {
            str = "";
        }
        AnonymousClass002.A1D(interfaceC7542F0w, 0, str);
        A02(interfaceC7542F0w);
        throw BV4.A0a("loadNextPage");
    }

    public static /* synthetic */ InterfaceC5106DYe loadPreviousPage$default(C5240De3 c5240De3, InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, String str, DYF dyf, AbstractC5243De8 abstractC5243De8, int i2, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: loadPreviousPage");
        }
        A01(interfaceC7542F0w);
        throw BV4.A0a("loadPreviousPage");
    }

    public final String getPaginationKey() {
        return this.paginationKey;
    }

    public final boolean hasNextPage() {
        return this.hasNextPage;
    }

    public final boolean hasPaginationKey() {
        return !MISSING_PAGINATION_KEY.equals(this.paginationKey);
    }

    public final boolean hasPreviousPage() {
        return this.hasPreviousPage;
    }

    public final boolean isLoadingNext() {
        return this.isLoadingNext;
    }

    public final boolean isLoadingPrevious() {
        return this.isLoadingPrevious;
    }

    public final boolean isPandoBacked() {
        return this.isPandoBacked;
    }

    public final String nextPageUUID() {
        return this.nextPageUUID;
    }

    public final String paginationLoadErrorMsg() {
        return this.paginationLoadErrorMsg;
    }

    public final boolean paginationLoadHadError() {
        return this.paginationLoadHadError;
    }

    public final String previousPageUUID() {
        return this.previousPageUUID;
    }

    public final String schema() {
        return this.schema;
    }

    public final ImmutableList<T> underlyingList() {
        return this.list;
    }

    public C5240De3(String str, ImmutableList<T> immutableList, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, String str4, boolean z5, String str5) {
        AnonymousClass003.A0u(str, immutableList);
        this.paginationKey = str;
        this.list = immutableList;
        this.hasPreviousPage = z;
        this.hasNextPage = z2;
        this.isLoadingPrevious = z3;
        this.isLoadingNext = z4;
        this.previousPageUUID = str2;
        this.nextPageUUID = str3;
        this.schema = str4;
        this.paginationLoadHadError = z5;
        this.paginationLoadErrorMsg = str5;
    }

    public static final void setExecutorProviderForTest(G0U g0u) {
        executorProviderForTest = g0u;
    }

    public final void appendEdge(InterfaceC7542F0w interfaceC7542F0w, InterfaceC2619Bfl interfaceC2619Bfl) {
        A01(interfaceC7542F0w);
        throw BV4.A0a("appendEdge");
    }

    public final void deleteEdge(InterfaceC7542F0w interfaceC7542F0w, InterfaceC2619Bfl interfaceC2619Bfl) {
        A01(interfaceC7542F0w);
        throw BV4.A0a("deleteEdge");
    }

    public final InterfaceC5106DYe loadNextPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, int i2, boolean z) {
        AnonymousClass003.A0v(interfaceC7542F0w, executor);
        String str = this.nextPageUUID;
        if (str == null) {
            str = "";
        }
        throw A00(interfaceC7542F0w, str);
    }

    public final void prependEdge(InterfaceC7542F0w interfaceC7542F0w, InterfaceC2619Bfl interfaceC2619Bfl) {
        A01(interfaceC7542F0w);
        throw BV4.A0a("prependEdge");
    }

    public final void replaceEdge(InterfaceC7542F0w interfaceC7542F0w, InterfaceC2619Bfl interfaceC2619Bfl, String str) {
        A01(interfaceC7542F0w);
        throw BV4.A0a("replaceEdge");
    }

    public final void setPandoBacked(boolean z) {
        this.isPandoBacked = z;
    }

    public final InterfaceC5106DYe loadNextPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor) {
        AnonymousClass003.A0v(interfaceC7542F0w, executor);
        String str = this.nextPageUUID;
        if (str == null) {
            str = "";
        }
        throw A00(interfaceC7542F0w, str);
    }

    public final InterfaceC5106DYe loadPreviousPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor) {
        AnonymousClass003.A0v(interfaceC7542F0w, executor);
        A02(interfaceC7542F0w);
        throw BV4.A0a("loadPreviousPage");
    }

    public final InterfaceC5106DYe loadNextPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, int i2) {
        AnonymousClass003.A0v(interfaceC7542F0w, executor);
        String str = this.nextPageUUID;
        if (str == null) {
            str = "";
        }
        throw A00(interfaceC7542F0w, str);
    }

    public final InterfaceC5106DYe loadPreviousPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, String str) {
        AnonymousClass005.A11(interfaceC7542F0w, executor, str, 0);
        A02(interfaceC7542F0w);
        throw BV4.A0a("loadPreviousPage");
    }

    public final InterfaceC5106DYe loadPreviousPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, String str, DYF dyf, AbstractC5243De8 abstractC5243De8) {
        A01(interfaceC7542F0w);
        throw BV4.A0a("loadPreviousPage");
    }

    public final InterfaceC5106DYe loadNextPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, int i2, boolean z, String str, DYF dyf, AbstractC5243De8 abstractC5243De8) {
        AnonymousClass002.A1D(interfaceC7542F0w, 0, str);
        A02(interfaceC7542F0w);
        throw BV4.A0a("loadNextPage");
    }

    public final InterfaceC5106DYe loadNextPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, int i2, boolean z, String str, DYF dyf) {
        AnonymousClass003.A0v(interfaceC7542F0w, executor);
        throw A00(interfaceC7542F0w, str);
    }

    public final InterfaceC5106DYe loadNextPage(InterfaceC7542F0w interfaceC7542F0w, int i, Executor executor, int i2, boolean z, String str) {
        AnonymousClass003.A0v(interfaceC7542F0w, executor);
        throw A00(interfaceC7542F0w, str);
    }
}

package androidx.room.util;

import X.AbstractC07127nr;
import X.C07258ie;
import X.C3UX;
import X.C78T;
import X.EIN;
import X.EJV;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [R] */
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1<R> extends AbstractC07127nr implements G0V<C3UX, HtJ<? super R>, Object> {
    public final /* synthetic */ G0U<EJV, R> $block;
    public final /* synthetic */ C78T $context;
    public final /* synthetic */ EIN $db;
    public final /* synthetic */ boolean $inTransaction;
    public final /* synthetic */ boolean $isReadOnly;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/78T;LX/EIN;ZZLX/G0U<-LX/EJV;+TR;>;LX/HtJ<-Landroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1;>;)V */
    public DBUtil__DBUtil_androidKt$performBlocking$1(EIN ein, HtJ htJ, C78T c78t, G0U g0u, boolean z, boolean z2) {
        super(2, htJ);
        this.$context = c78t;
        this.$db = ein;
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$block = g0u;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C78T c78t = this.$context;
        return new DBUtil__DBUtil_androidKt$performBlocking$1(this.$db, htJ, c78t, this.$block, this.$inTransaction, this.$isReadOnly);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, Object obj) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1) create(c3ux, (HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C78T c78t = this.$context;
            C07258ie c07258ie = new C07258ie(this.$db, null, this.$block, 0, this.$inTransaction, this.$isReadOnly);
            this.label = 1;
            obj = GAo.A00(this, c78t, c07258ie);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}

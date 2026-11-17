package X;

import androidx.room.util.DBUtil__DBUtil_androidKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
/* renamed from: X.7Bk, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Bk<R> extends HzP {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DBUtil__DBUtil_androidKt.A00(null, this, null, false, false);
    }

    public C7Bk(HtJ<? super C7Bk> htJ) {
        super(htJ);
    }
}

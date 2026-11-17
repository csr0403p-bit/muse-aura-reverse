package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, R.styleable.maplibre_MapView_maplibre_uiRotateGestures, 55, 58}, m = "invokeSuspend", v = 2)
/* renamed from: X.AGo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0887AGo<T> extends AbstractC07117nq implements G0V<BOZ<? super List<? extends T>>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Iterator<T> $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Iterator<+TT;>;ZZLX/HtJ<-LX/AGo;>;)V */
    public C0887AGo(Iterator it, HtJ htJ, int i, int i2, boolean z, boolean z2) {
        super(2, htJ);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C0887AGo c0887AGo = new C0887AGo(this.$iterator, htJ, this.$size, this.$step, this.$reuseBuffer, this.$partialWindows);
        c0887AGo.L$0 = obj;
        return c0887AGo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[PHI: r2 r3 r4
  0x012d: PHI (r2v7 java.util.ArrayList) = (r2v15 java.util.ArrayList), (r2v16 java.util.ArrayList) binds: [B:61:0x012b, B:71:0x015a] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r3v6 int) = (r3v4 int), (r3v7 int) binds: [B:61:0x012b, B:71:0x015a] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r4v7 int) = (r4v5 int), (r4v8 int) binds: [B:61:0x012b, B:71:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:28:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x010a -> B:59:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x014c -> B:71:0x015a). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0887AGo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, HtJ<? super Unit> htJ) {
        return ((C0887AGo) C8j3.A1E(htJ, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}

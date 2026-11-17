package X;

import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures, 73, HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 1)
/* renamed from: X.4vo, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4vo extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<T[]> $arrayFactory;
    public final /* synthetic */ C20Q<T>[] $flows;
    public final /* synthetic */ C20Z<R> $this_combineInternal;
    public final /* synthetic */ G0W<C20Z<? super R>, T[], HtJ<? super Unit>, Object> $transform;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: ([LX/20Q<+TT;>;Lkotlin/jvm/functions/Function0<[TT;>;LX/G0W<-LX/20Z<-TR;>;-[TT;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/20Z<-TR;>;LX/HtJ<-LX/4vo;>;)V */
    public C4vo(HtJ htJ, Function0 function0, G0W g0w, C20Z c20z, C20Q[] c20qArr) {
        super(2, htJ);
        this.$flows = c20qArr;
        this.$arrayFactory = function0;
        this.$transform = g0w;
        this.$this_combineInternal = c20z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C4vo c4vo = new C4vo(htJ, this.$arrayFactory, this.$transform, this.$this_combineInternal, this.$flows);
        c4vo.L$0 = obj;
        return c4vo;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((C4vo) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (r5 != 0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x009d, B:28:0x008d], limit reached: 49 */
    /* JADX WARN: Path cross not found for [B:41:0x0102, B:34:0x009f], limit reached: 49 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[LOOP:0: B:23:0x007b->B:46:?, LOOP_START, PHI: r1 r5
  0x007b: PHI (r1v8 X.BRq) = (r1v7 X.BRq), (r1v11 X.BRq) binds: [B:20:0x0076, B:46:?] A[DONT_GENERATE, DONT_INLINE]
  0x007b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:20:0x0076, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.20Q<T>[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.20Q<T>[], X.20Q[]] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.GCV, X.HzR] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.HxV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [X.HxV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [X.HxV] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c7 -> B:41:0x0102). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4vo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

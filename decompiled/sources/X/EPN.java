package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "libraries.access.src.main.bloks.impl.FxAccessLibraryUnifiedBloksImpl$fetchAuthDataForSourceForCaller$1", f = "FxAccessLibraryUnifiedBloksImpl.kt", l = {121}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class EPN extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Hj6 $arguments;
    public final /* synthetic */ F6D $environment;
    public final /* synthetic */ String $featureName;
    public final /* synthetic */ String $waterfallId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ EPU this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Hj6;LX/EPU;Ljava/lang/String;LX/F6D;Ljava/lang/String;LX/HtJ<-LX/EPN;>;)V */
    public EPN(F6D f6d, Hj6 hj6, String str, String str2, HtJ htJ, EPU epu) {
        super(2, htJ);
        this.$arguments = hj6;
        this.this$0 = epu;
        this.$featureName = str;
        this.$environment = f6d;
        this.$waterfallId = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Hj6 hj6 = this.$arguments;
        EPU epu = this.this$0;
        EPN epn = new EPN(this.$environment, hj6, this.$featureName, this.$waterfallId, htJ, epu);
        epn.L$0 = obj;
        return epn;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((EPN) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}

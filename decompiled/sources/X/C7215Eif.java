package X;

import java.util.Map;

/* renamed from: X.Eif, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7215Eif extends AbstractC7559F3s implements G0U<Ejq, InterfaceC7005EeA<InterfaceC7236Ej0<EfF<InterfaceC7064EfB>>>> {
    public final /* synthetic */ Object $callerContext;
    public final /* synthetic */ Map<String, Object> $extras;
    public final /* synthetic */ C7197Ei9 $imageOptions;
    public final /* synthetic */ C7182Ehs $imagePipeline;
    public final /* synthetic */ InterfaceC7258Eji $imagePipelineUtils;
    public final /* synthetic */ InterfaceC7250EjU $requestListener;
    public final /* synthetic */ String $uiComponentId;
    public final /* synthetic */ C7482Exf $viewport;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ InterfaceC7005EeA<InterfaceC7236Ej0<EfF<InterfaceC7064EfB>>> invoke(Ejq ejq) {
        Ejq ejq2 = ejq;
        C7384Etj.A0Y(ejq2, 0);
        C7182Ehs c7182Ehs = this.$imagePipeline;
        InterfaceC7258Eji interfaceC7258Eji = this.$imagePipelineUtils;
        C7197Ei9 c7197Ei9 = this.$imageOptions;
        Object obj = this.$callerContext;
        return AbstractC7216Eig.A00(this.$viewport, interfaceC7258Eji, c7197Ei9, ejq2, c7182Ehs, this.$requestListener, obj, this.$uiComponentId, this.$extras);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Ehs;LX/Eji;LX/Ei9;Ljava/lang/Object;LX/EjU;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;LX/Exf;)V */
    public C7215Eif(C7482Exf c7482Exf, InterfaceC7258Eji interfaceC7258Eji, C7197Ei9 c7197Ei9, C7182Ehs c7182Ehs, InterfaceC7250EjU interfaceC7250EjU, Object obj, String str, Map map) {
        super(1);
        this.$imagePipeline = c7182Ehs;
        this.$imagePipelineUtils = interfaceC7258Eji;
        this.$imageOptions = c7197Ei9;
        this.$callerContext = obj;
        this.$requestListener = interfaceC7250EjU;
        this.$uiComponentId = str;
        this.$extras = map;
        this.$viewport = c7482Exf;
    }
}

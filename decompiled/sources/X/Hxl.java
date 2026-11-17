package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "libraries.access.src.main.base.interfaces.defaultimpl.DefaultFxUnifiedAccessLibraryReader$readAuthDataForSingleRequestWithCoroutine$1", f = "DefaultFxUnifiedAccessLibraryReader.kt", l = {214}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class Hxl extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends EPY>>, Object> {
    public final /* synthetic */ FBB $bloksContext;
    public final /* synthetic */ String $callerClass;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ GBK $dispatcher;
    public final /* synthetic */ String $featureName;
    public final /* synthetic */ EQ3 $fxAccountRequestItem;
    public final /* synthetic */ InterfaceC7542F0w $session;
    public final /* synthetic */ String $waterfallId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EQ3;Ljava/lang/String;LX/F0w;LX/FBB;Ljava/lang/String;LX/GBK;Ljava/lang/String;LX/HtJ<-LX/Hxl;>;)V */
    public Hxl(Context context, FBB fbb, InterfaceC7542F0w interfaceC7542F0w, String str, String str2, String str3, HtJ htJ, GBK gbk, EQ3 eq3) {
        super(2, htJ);
        this.$context = context;
        this.$fxAccountRequestItem = eq3;
        this.$featureName = str;
        this.$session = interfaceC7542F0w;
        this.$bloksContext = fbb;
        this.$callerClass = str2;
        this.$dispatcher = gbk;
        this.$waterfallId = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Context context = this.$context;
        EQ3 eq3 = this.$fxAccountRequestItem;
        String str = this.$featureName;
        InterfaceC7542F0w interfaceC7542F0w = this.$session;
        return new Hxl(context, this.$bloksContext, interfaceC7542F0w, str, this.$callerClass, this.$waterfallId, htJ, this.$dispatcher, eq3);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HtY htY = HtY.A00;
            Context context = this.$context;
            EQ3 eq3 = this.$fxAccountRequestItem;
            String str = this.$featureName;
            InterfaceC7542F0w interfaceC7542F0w = this.$session;
            FBB fbb = this.$bloksContext;
            GBK gbk = this.$dispatcher;
            String str2 = this.$waterfallId;
            this.label = 1;
            obj = HtY.A01(context, fbb, interfaceC7542F0w, str, str2, this, gbk, eq3, htY);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends EPY>> htJ) {
        return ((Hxl) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}

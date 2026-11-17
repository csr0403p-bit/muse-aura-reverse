package X;

import android.content.Context;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "libraries.access.src.main.bloks.impl.FxAccessLibraryUnifiedBloksImpl$fetchAuthDataWithUnifiedAPI$2", f = "FxAccessLibraryUnifiedBloksImpl.kt", l = {262}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class EPG extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AbstractC6670EOh $accessLibraryLogger;
    public final /* synthetic */ C10543Hqv<List<EPY>> $accountItems;
    public final /* synthetic */ Set<EPM> $accountType;
    public final /* synthetic */ List<Object> $authData;
    public final /* synthetic */ FBB $bloksContext;
    public final /* synthetic */ String $callerName;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $credentialSource;
    public final /* synthetic */ EPM $initiator;
    public final /* synthetic */ InterfaceC7542F0w $session;
    public final /* synthetic */ String $waterfallId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ EPU this$0;

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        EPU epu = this.this$0;
        EPM epm = this.$initiator;
        Set<EPM> set = this.$accountType;
        String str = this.$credentialSource;
        AbstractC6670EOh abstractC6670EOh = this.$accessLibraryLogger;
        String str2 = this.$callerName;
        Context context = this.$context;
        C3UX c3ux = this.$coroutineScope;
        InterfaceC7542F0w interfaceC7542F0w = this.$session;
        EPG epg = new EPG(context, this.$bloksContext, interfaceC7542F0w, str, str2, this.$waterfallId, this.$authData, set, htJ, this.$accountItems, c3ux, epm, abstractC6670EOh, epu);
        epg.L$0 = obj;
        return epg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/EPU;LX/EPM;Ljava/util/Set<+LX/EPM;>;Ljava/lang/String;LX/EOh;Ljava/lang/String;Landroid/content/Context;LX/3UX;LX/F0w;LX/FBB;Ljava/lang/String;LX/Hqv<Ljava/util/List<LX/EPY;>;>;Ljava/util/List<Ljava/lang/Object;>;LX/HtJ<-LX/EPG;>;)V */
    public EPG(Context context, FBB fbb, InterfaceC7542F0w interfaceC7542F0w, String str, String str2, String str3, List list, Set set, HtJ htJ, C10543Hqv c10543Hqv, C3UX c3ux, EPM epm, AbstractC6670EOh abstractC6670EOh, EPU epu) {
        super(2, htJ);
        this.this$0 = epu;
        this.$initiator = epm;
        this.$accountType = set;
        this.$credentialSource = str;
        this.$accessLibraryLogger = abstractC6670EOh;
        this.$callerName = str2;
        this.$context = context;
        this.$coroutineScope = c3ux;
        this.$session = interfaceC7542F0w;
        this.$bloksContext = fbb;
        this.$waterfallId = str3;
        this.$accountItems = c10543Hqv;
        this.$authData = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5 A[Catch: all -> 0x029e, TryCatch #1 {all -> 0x029e, blocks: (B:96:0x01ab, B:97:0x01bf, B:99:0x01c5, B:100:0x01d1, B:102:0x01d5, B:122:0x0217, B:123:0x021d, B:131:0x0232, B:133:0x0238, B:145:0x0287, B:146:0x028b, B:144:0x026c, B:105:0x01e0, B:108:0x01eb, B:111:0x01f6, B:114:0x01ff, B:119:0x020f, B:147:0x028c, B:86:0x0136, B:87:0x013a, B:89:0x0140, B:90:0x017b, B:92:0x019c, B:93:0x019f), top: B:155:0x0136 }] */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, java.util.ArrayList] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((EPG) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}

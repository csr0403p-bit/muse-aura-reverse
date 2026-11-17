package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EZ7 extends C7438Evz implements G0V {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public EZ7(Object obj, int i) {
        Class cls;
        String str;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                cls = C4299Csn.class;
                str = "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;";
                str2 = "getCredentialExceptionTypeToException";
                break;
            case 3:
                cls = C5192Dd3.class;
                str = "emitsPassIndex$fbandroid_libraries_bloks_stdlib_components_bk_components_shadereffect_bk_components_shadereffect(ILjava/lang/String;)Z";
                str2 = "emitsPassIndex";
                break;
            case 4:
                cls = C5630DmE.class;
                str = "onTagsChangedForToken(Ljava/lang/String;Lcom/facebook/analytics/structuredlogger/structs/TMediaPlaybackTagMetadataImpl;)V";
                str2 = "onTagsChangedForToken";
                break;
            default:
                cls = C4883DBc.class;
                str = "onStartupPoint(Ljava/lang/Object;Ljava/lang/Object;)V";
                str2 = "onStartupPoint";
                break;
        }
        super(2, obj, cls, str2, str, 0);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean zAdd;
        boolean zIsEmpty;
        switch (this.$t) {
            case 3:
                int iA0F = AnonymousClass001.A0F(obj);
                String str = (String) obj2;
                C7384Etj.A0Y(str, 1);
                C06827l3 c06827l3 = C5192Dd3.A06;
                return Boolean.valueOf(iA0F > 0 && C5192Dd3.A0A.A07(str));
            case 4:
                String str2 = (String) obj;
                C7384Etj.A0Y(str2, 0);
                C5630DmE.A03((C5962Dsy) obj2, (C5630DmE) this.receiver, str2, false);
                break;
            case 5:
                C4883DBc c4883DBc = (C4883DBc) this.receiver;
                String strInvoke = c4883DBc.A05.invoke(obj, obj2);
                if (strInvoke != null) {
                    c4883DBc.A03.invoke(strInvoke);
                }
                Object obj3 = c4883DBc.A01.get(obj);
                if (obj3 != null) {
                    synchronized (c4883DBc) {
                        zAdd = c4883DBc.A00.add(obj3);
                    }
                } else {
                    zAdd = false;
                }
                synchronized (c4883DBc) {
                    Ao0<T> ao0 = c4883DBc.A00;
                    if (ao0.remove(obj)) {
                        zAdd = true;
                    }
                    zIsEmpty = ao0.isEmpty();
                }
                if (zAdd) {
                    if (!zIsEmpty) {
                        if (c4883DBc.A06) {
                            c4883DBc.A02.invoke();
                            break;
                        }
                    } else {
                        c4883DBc.A06 = true;
                        c4883DBc.A04.invoke("PointsMatched");
                        break;
                    }
                }
                break;
            default:
                return C4299Csn.A00((String) obj, (String) obj2);
        }
        return Unit.INSTANCE;
    }
}

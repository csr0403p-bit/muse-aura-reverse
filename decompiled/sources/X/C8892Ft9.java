package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.Unit;

/* renamed from: X.Ft9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8892Ft9 extends AbstractC07127nr implements G0V {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8892Ft9(Object obj, C6837Eap c6837Eap, Context context, String str, HtJ<? super C8892Ft9> htJ) {
        super(2, str);
        this.$t = htJ;
        this.A00 = c6837Eap;
        this.A01 = obj;
        this.A02 = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        String str;
        int i;
        if (this.$t != 0) {
            obj3 = this.A01;
            str = this.A02;
            obj2 = this.A00;
            i = 1;
        } else {
            obj2 = this.A00;
            obj3 = this.A01;
            str = this.A02;
            i = 0;
        }
        return new C8892Ft9(obj3, obj2, str, htJ, i);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        String str;
        if (this.$t != 0) {
            Hwg.A00(obj);
            C9591GQq c9591GQq = ((MetaAiRsysSdkRealTimeSession) this.A01).A0C;
            String str2 = this.A02;
            Object obj2 = this.A00;
            C7384Etj.A0Y(str2, 0);
            FYR fyr = new FYR(str2, obj2, 1);
            GR9 gr9 = c9591GQq.A0C;
            if (gr9 != null) {
                fyr.invoke(gr9);
            } else {
                AbstractC7608F5v.A1L("SendInput called before call object is available. Caching the action to execute later");
                c9591GQq.A01.A01.add(fyr);
            }
        } else {
            Hwg.A00(obj);
            Iterator itA10 = BV5.A10(((C6837Eap) this.A00).A01());
            while (itA10.hasNext()) {
                C6840Eas c6840Eas = (C6840Eas) itA10.next();
                C7384Etj.A0S(c6840Eas);
                if (c6840Eas.A00 == null) {
                    String str3 = c6840Eas.A04;
                    C7384Etj.A0U(str3);
                    if (str3.startsWith(HatchWebPageParserKt.DATA_URI_PREFIX) && C7BY.A0B(str3, "base64,", 0, false) > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(BV4.A0g(C7BY.A08(str3, ',', 0), str3), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            c6840Eas.A00 = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e) {
                            BXP.A01("data URL did not have correct base64 format.", e);
                        }
                    }
                }
                Context context = (Context) this.A01;
                String str4 = this.A02;
                if (c6840Eas.A00 == null && str4 != null) {
                    try {
                        InputStream inputStreamOpen = context.getAssets().open(AnonymousClass006.A0y(c6840Eas.A04, str4, C60O.A0w()));
                        C7384Etj.A0U(inputStreamOpen);
                        try {
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inScaled = true;
                            options2.inDensity = 160;
                            c6840Eas.A00 = AbstractC8712FjD.A02(BitmapFactory.decodeStream(inputStreamOpen, null, options2), c6840Eas.A02, c6840Eas.A01);
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            str = "Unable to decode image.";
                            BXP.A01(str, e);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str = "Unable to open asset.";
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8892Ft9) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }
}

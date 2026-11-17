package X;

import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;

/* loaded from: classes6.dex */
public final class G6F implements G6J {
    @Override // X.G6J
    public final void AYa(String str, G65 g65, G6G g6g) {
        boolean zA1a = AnonymousClass002.A1a(g6g, str);
        C7384Etj.A0Y(g65, 2);
        String strA0l = AnonymousClass002.A0l(AbstractC0878AGe.A0L("", "", "", g65.ADb().subList(zA1a ? 1 : 0, AbstractC7607F5u.A0J(g65.ADb(), zA1a ? 1 : 0)), new FYV(str, 2)));
        g6g.A03(AuraDeeplinkRouteMapper.CODE_PARAM, g65, new CharSequence[0], false);
        g6g.A01(strA0l);
        g6g.A02(AuraDeeplinkRouteMapper.CODE_PARAM);
    }
}

package X;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.Fb4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8280Fb4 {
    public Object A00;
    public boolean A01;

    public final void A00() {
        if (this instanceof C8261Faj) {
            C8261Faj c8261Faj = (C8261Faj) this;
            if (c8261Faj.A05) {
                return;
            }
            c8261Faj.A05 = true;
            c8261Faj.A01.ASW(c8261Faj);
            return;
        }
        C8258Fae c8258Fae = (C8258Fae) this;
        C8251FaW c8251FaW = c8258Fae.A04;
        if (c8251FaW.A04 == c8258Fae) {
            boolean z = c8251FaW.A0F;
            boolean z2 = c8251FaW.A0G;
            if (z || z2) {
                c8251FaW.A06 = c8258Fae;
                c8251FaW.A05 = c8258Fae.A00;
            } else {
                c8258Fae.A00.ASW(c8258Fae);
            }
            c8258Fae.A00 = null;
            c8251FaW.A07(false);
            ActionBarContextView actionBarContextView = c8251FaW.A09;
            if (actionBarContextView.A04 == null) {
                actionBarContextView.A05();
            }
            c8251FaW.A0A.setHideOnContentScrollEnabled(c8251FaW.A0H);
            c8251FaW.A04 = null;
        }
    }

    public final void A01() {
        if (this instanceof C8261Faj) {
            C8261Faj c8261Faj = (C8261Faj) this;
            c8261Faj.A01.AUt(c8261Faj.A02, c8261Faj);
            return;
        }
        C8258Fae c8258Fae = (C8258Fae) this;
        if (c8258Fae.A04.A04 == c8258Fae) {
            C8249FaR c8249FaR = c8258Fae.A03;
            c8249FaR.A07();
            try {
                c8258Fae.A00.AUt(c8249FaR, c8258Fae);
            } finally {
                c8249FaR.A06();
            }
        }
    }
}

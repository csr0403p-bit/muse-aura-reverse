package X;

import com.fasterxml.jackson.core.JsonGenerationException;

/* renamed from: X.Gmv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9979Gmv extends AbstractC9932GlT {
    public int A00;
    public InterfaceC10180Gqq A01;
    public boolean A02;
    public boolean A03;
    public int[] A04;
    public final C10061Goi A05;
    public static final int[] A07 = AbstractC10006Gne.A07;
    public static final C10037GoH<EnumC10052GoW> A06 = AbstractC9919GlE.A02;

    public final void A14(String str) throws JsonGenerationException {
        throw new JsonGenerationException(this, String.format("Can not %s, expecting field name (context: %s)", str, super.A02.A03()));
    }

    public final void A15(String str, int i) throws JsonGenerationException {
        if (i == 0) {
            int i2 = ((AbstractC10020Gns) super.A02).A02;
            if (i2 == 1) {
                ((AbstractC9919GlE) this).A00.A53(this);
                return;
            } else {
                if (i2 == 2) {
                    ((AbstractC9919GlE) this).A00.A54(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            ((AbstractC9919GlE) this).A00.Aid(this);
            return;
        }
        if (i == 2) {
            ((AbstractC9919GlE) this).A00.Aiq(this);
        } else {
            if (i != 3) {
                A14(str);
                throw F60.createAndThrow();
            }
            ((AbstractC9919GlE) this).A00.Aiu(this);
        }
    }

    public AbstractC9979Gmv(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, int i) {
        super(abstractC9794GhC, c9984Gn6, i);
        this.A04 = A07;
        this.A01 = C9924GlL.A03;
        this.A05 = c9984Gn6.A0A;
        if ((EnumC9998GnS.ESCAPE_NON_ASCII._mask & i) != 0) {
            this.A00 = 127;
        }
        this.A03 = AbstractC7609F5w.A1U(i, EnumC9998GnS.WRITE_HEX_UPPER_CASE._mask);
        this.A02 = !AbstractC7609F5w.A1U(i, EnumC9998GnS.QUOTE_FIELD_NAMES._mask);
    }

    @Override // X.AbstractC9932GlT, X.AbstractC9919GlE
    public final void A0b(EnumC9998GnS enumC9998GnS) {
        super.A0b(enumC9998GnS);
        if (enumC9998GnS == EnumC9998GnS.QUOTE_FIELD_NAMES) {
            this.A02 = true;
        } else if (enumC9998GnS == EnumC9998GnS.WRITE_HEX_UPPER_CASE) {
            this.A03 = false;
        }
    }

    @Override // X.AbstractC9932GlT
    public final void A11(int i, int i2) {
        super.A11(i, i2);
        this.A02 = !AbstractC7609F5w.A1U(i, EnumC9998GnS.QUOTE_FIELD_NAMES._mask);
        this.A03 = AbstractC7609F5w.A1U(i, EnumC9998GnS.WRITE_HEX_UPPER_CASE._mask);
    }
}

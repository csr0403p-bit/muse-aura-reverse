package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GlL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9924GlL extends AbstractC10191Gr8 implements Serializable {
    public static final int A02;
    public static final InterfaceC10180Gqq A03;
    public static final int A04;
    public static final int A05;
    public static final long serialVersionUID = 2;
    public transient Gn3 A00;
    public final transient Gn5 A01;
    public AbstractC10192Gr9 _characterEscapes;
    public C9518GMl _errorReportConfiguration;
    public int _factoryFeatures;
    public final List _generatorDecorators;
    public int _generatorFeatures;
    public AbstractC10197GrI _inputDecorator;
    public int _maximumNonEscapedChar;
    public AbstractC9794GhC _objectCodec;
    public AbstractC10198GrJ _outputDecorator;
    public int _parserFeatures;
    public final char _quoteChar;
    public FWS<HjR> _recyclerPool;
    public InterfaceC10180Gqq _rootValueSeparator;
    public C10002GnY _streamReadConstraints;
    public C10061Goi _streamWriteConstraints;

    public C9924GlL() {
        this(null);
    }

    public static final C9984Gn6 A00(C9924GlL c9924GlL, C9517GMk c9517GMk, boolean z) {
        HjR hjRA2y;
        boolean z2 = false;
        Object obj = c9517GMk.A00;
        if (!(obj instanceof InterfaceC10184Gqu) || (hjRA2y = ((InterfaceC10184Gqu) obj).A5N()) == null) {
            hjRA2y = (!AbstractC7609F5w.A1U(c9924GlL._factoryFeatures, AbstractC7609F5w.A0F(EnumC10039GoJ.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING)) ? C10530Hpw.A00 : c9924GlL._recyclerPool).A2y();
        } else {
            z2 = true;
        }
        C9984Gn6 c9984Gn6 = new C9984Gn6(c9924GlL._errorReportConfiguration, c9924GlL._streamReadConstraints, c9924GlL._streamWriteConstraints, c9517GMk, hjRA2y, z);
        if (z2) {
            c9984Gn6.A01 = false;
        }
        return c9984Gn6;
    }

    public final Gn0 A02(Writer writer) {
        Gn0 gn0 = new Gn0(this._objectCodec, A00(this, new C9517GMk(this._errorReportConfiguration, writer), false), writer, this._quoteChar, this._generatorFeatures);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            ((AbstractC9979Gmv) gn0).A00 = i;
        }
        InterfaceC10180Gqq interfaceC10180Gqq = this._rootValueSeparator;
        if (interfaceC10180Gqq != A03) {
            ((AbstractC9979Gmv) gn0).A01 = interfaceC10180Gqq;
        }
        List list = this._generatorDecorators;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw BV4.A0a("decorate");
            }
        }
        return gn0;
    }

    public Object readResolve() {
        return new C9924GlL(this, this._objectCodec);
    }

    static {
        int iA0F = 0;
        for (EnumC10039GoJ enumC10039GoJ : EnumC10039GoJ.values()) {
            if (enumC10039GoJ._defaultState) {
                iA0F |= AbstractC7609F5w.A0F(enumC10039GoJ);
            }
        }
        A04 = iA0F;
        int i = 0;
        for (EnumC10012Gnk enumC10012Gnk : EnumC10012Gnk.values()) {
            if (enumC10012Gnk._defaultState) {
                i |= enumC10012Gnk._mask;
            }
        }
        A02 = i;
        int i2 = 0;
        for (EnumC9998GnS enumC9998GnS : EnumC9998GnS.values()) {
            if (enumC9998GnS._defaultState) {
                i2 |= enumC9998GnS._mask;
            }
        }
        A05 = i2;
        A03 = new C10026Go0(InviteCodeScratcherKt.CODE_SEPARATOR);
    }

    public final C9981Gmx A01(String str) throws StreamConstraintsException {
        int length = str.length();
        if (length > 32768) {
            StringReader stringReader = new StringReader(str);
            C9984Gn6 c9984Gn6A00 = A00(this, new C9517GMk(this._errorReportConfiguration, stringReader), false);
            int i = AbstractC9988GnE.A09;
            return new C9981Gmx(this._objectCodec, c9984Gn6A00, this.A00.A00(), stringReader, this._parserFeatures);
        }
        C9984Gn6 c9984Gn6A002 = A00(this, new C9517GMk(this._errorReportConfiguration, str), true);
        C9984Gn6.A00(c9984Gn6A002.A06);
        char[] cArrA03 = c9984Gn6A002.A0C.A03(0, length);
        c9984Gn6A002.A06 = cArrA03;
        str.getChars(0, length, cArrA03, 0);
        this._streamReadConstraints.A05(length);
        int i2 = AbstractC9988GnE.A09;
        return new C9981Gmx(this._objectCodec, c9984Gn6A002, this.A00.A00(), cArrA03, this._parserFeatures, length);
    }

    public C9924GlL(C9924GlL c9924GlL, AbstractC9794GhC abstractC9794GhC) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.A01 = new Gn5((((int) jCurrentTimeMillis) + BV6.A03(jCurrentTimeMillis)) | 1);
        this._factoryFeatures = A04;
        this._parserFeatures = A02;
        this._generatorFeatures = A05;
        this._rootValueSeparator = A03;
        this._recyclerPool = c9924GlL._recyclerPool;
        this._objectCodec = abstractC9794GhC;
        this._factoryFeatures = c9924GlL._factoryFeatures;
        this._parserFeatures = c9924GlL._parserFeatures;
        this._generatorFeatures = c9924GlL._generatorFeatures;
        this._inputDecorator = null;
        this._outputDecorator = null;
        List list = c9924GlL._generatorDecorators;
        this._generatorDecorators = list != null ? BV4.A0t(list) : list;
        C10002GnY c10002GnY = c9924GlL._streamReadConstraints;
        c10002GnY.getClass();
        this._streamReadConstraints = c10002GnY;
        C10061Goi c10061Goi = c9924GlL._streamWriteConstraints;
        c10061Goi.getClass();
        this._streamWriteConstraints = c10061Goi;
        C9518GMl c9518GMl = c9924GlL._errorReportConfiguration;
        c9518GMl.getClass();
        this._errorReportConfiguration = c9518GMl;
        this._characterEscapes = null;
        this._rootValueSeparator = c9924GlL._rootValueSeparator;
        this._maximumNonEscapedChar = c9924GlL._maximumNonEscapedChar;
        this._quoteChar = c9924GlL._quoteChar;
        this.A00 = new Gn3(this._streamReadConstraints, this._factoryFeatures, System.identityHashCode(this));
    }

    public C9924GlL(AbstractC9794GhC abstractC9794GhC) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.A01 = new Gn5((((int) jCurrentTimeMillis) + BV6.A03(jCurrentTimeMillis)) | 1);
        int i = A04;
        this._factoryFeatures = i;
        this._parserFeatures = A02;
        this._generatorFeatures = A05;
        this._rootValueSeparator = A03;
        this._recyclerPool = Hpv.A00;
        this._objectCodec = abstractC9794GhC;
        this._quoteChar = '\"';
        C10002GnY c10002GnY = C10002GnY.A00;
        this._streamReadConstraints = c10002GnY;
        this._streamWriteConstraints = C10061Goi.A00;
        this._errorReportConfiguration = C9518GMl.A00;
        this._generatorDecorators = null;
        this.A00 = new Gn3(c10002GnY, i, System.identityHashCode(this));
    }
}

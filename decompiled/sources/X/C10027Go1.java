package X;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Go1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10027Go1 implements InterfaceC10049GoT, InterfaceC10158GqR<C10027Go1>, Serializable {
    public static final long serialVersionUID = 1;
    public transient int A00;
    public String _arrayEmptySeparator;
    public InterfaceC10163GqY _arrayIndenter;
    public String _arrayValueSeparator;
    public String _objectEmptySeparator;
    public String _objectEntrySeparator;
    public String _objectFieldValueSeparatorWithSpaces;
    public InterfaceC10163GqY _objectIndenter;
    public InterfaceC10180Gqq _rootSeparator;
    public C10055Goa _separators;

    @Deprecated
    public boolean _spacesInObjectEntries;

    static {
        Gn4 gn4 = C10026Go0.A01;
    }

    public C10027Go1() {
        C10055Goa c10055Goa = InterfaceC10049GoT.A01;
        this._arrayIndenter = C10157GqP.A00;
        this._objectIndenter = C10096GpK.A00;
        this._spacesInObjectEntries = true;
        this._separators = c10055Goa;
        String str = c10055Goa.rootSeparator;
        this._rootSeparator = str == null ? null : new C10026Go0(str);
        EnumC9660Gd0 enumC9660Gd0 = c10055Goa.objectFieldValueSpacing;
        this._objectFieldValueSeparatorWithSpaces = FGI.A0O(enumC9660Gd0.spacesBefore, enumC9660Gd0.spacesAfter, c10055Goa.objectFieldValueSeparator);
        EnumC9660Gd0 enumC9660Gd02 = c10055Goa.objectEntrySpacing;
        this._objectEntrySeparator = FGI.A0O(enumC9660Gd02.spacesBefore, enumC9660Gd02.spacesAfter, c10055Goa.objectEntrySeparator);
        this._objectEmptySeparator = c10055Goa.objectEmptySeparator;
        EnumC9660Gd0 enumC9660Gd03 = c10055Goa.arrayValueSpacing;
        this._arrayValueSeparator = FGI.A0O(enumC9660Gd03.spacesBefore, enumC9660Gd03.spacesAfter, c10055Goa.arrayValueSeparator);
        this._arrayEmptySeparator = c10055Goa.arrayEmptySeparator;
    }

    @Override // X.InterfaceC10049GoT
    public final void A53(AbstractC9919GlE abstractC9919GlE) {
        this._arrayIndenter.Aim(abstractC9919GlE, this.A00);
    }

    @Override // X.InterfaceC10049GoT
    public final void A54(AbstractC9919GlE abstractC9919GlE) {
        this._objectIndenter.Aim(abstractC9919GlE, this.A00);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aid(AbstractC9919GlE abstractC9919GlE) throws IOException {
        abstractC9919GlE.A0q(this._arrayValueSeparator);
        this._arrayIndenter.Aim(abstractC9919GlE, this.A00);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aii(AbstractC9919GlE abstractC9919GlE, int i) throws IOException {
        InterfaceC10163GqY interfaceC10163GqY = this._arrayIndenter;
        if (!interfaceC10163GqY.isInline()) {
            this.A00--;
        }
        if (i > 0) {
            interfaceC10163GqY.Aim(abstractC9919GlE, this.A00);
        } else {
            abstractC9919GlE.A0q(this._arrayEmptySeparator);
        }
        abstractC9919GlE.A0U(']');
    }

    @Override // X.InterfaceC10049GoT
    public final void Aij(AbstractC9919GlE abstractC9919GlE, int i) throws IOException {
        InterfaceC10163GqY interfaceC10163GqY = this._objectIndenter;
        if (!interfaceC10163GqY.isInline()) {
            this.A00--;
        }
        if (i > 0) {
            interfaceC10163GqY.Aim(abstractC9919GlE, this.A00);
        } else {
            abstractC9919GlE.A0q(this._objectEmptySeparator);
        }
        abstractC9919GlE.A0U('}');
    }

    @Override // X.InterfaceC10049GoT
    public final void Aip(AbstractC9919GlE abstractC9919GlE) throws IOException {
        abstractC9919GlE.A0q(this._objectEntrySeparator);
        this._objectIndenter.Aim(abstractC9919GlE, this.A00);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aiq(AbstractC9919GlE abstractC9919GlE) throws IOException {
        abstractC9919GlE.A0q(this._objectFieldValueSeparatorWithSpaces);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aiu(AbstractC9919GlE abstractC9919GlE) throws IOException {
        InterfaceC10180Gqq interfaceC10180Gqq = this._rootSeparator;
        if (interfaceC10180Gqq != null) {
            abstractC9919GlE.A0d(interfaceC10180Gqq);
        }
    }

    @Override // X.InterfaceC10049GoT
    public final void Aix(AbstractC9919GlE abstractC9919GlE) {
        if (!this._arrayIndenter.isInline()) {
            this.A00++;
        }
        abstractC9919GlE.A0U('[');
    }

    @Override // X.InterfaceC10049GoT
    public final void Aiy(AbstractC9919GlE abstractC9919GlE) {
        abstractC9919GlE.A0U('{');
        if (this._objectIndenter.isInline()) {
            return;
        }
        this.A00++;
    }

    @Override // X.InterfaceC10158GqR
    public final /* bridge */ /* synthetic */ C10027Go1 A7r() {
        Class<?> cls = getClass();
        if (cls != C10027Go1.class) {
            throw BV5.A0V("Failed `createInstance()`: ", cls.getName(), " does not override method; it has to");
        }
        C10027Go1 c10027Go1 = new C10027Go1();
        c10027Go1._arrayIndenter = C10157GqP.A00;
        c10027Go1._objectIndenter = C10096GpK.A00;
        c10027Go1._spacesInObjectEntries = true;
        c10027Go1._rootSeparator = this._rootSeparator;
        c10027Go1._arrayIndenter = this._arrayIndenter;
        c10027Go1._objectIndenter = this._objectIndenter;
        c10027Go1._spacesInObjectEntries = this._spacesInObjectEntries;
        c10027Go1.A00 = this.A00;
        c10027Go1._separators = this._separators;
        c10027Go1._objectFieldValueSeparatorWithSpaces = this._objectFieldValueSeparatorWithSpaces;
        c10027Go1._objectEntrySeparator = this._objectEntrySeparator;
        c10027Go1._objectEmptySeparator = this._objectEmptySeparator;
        c10027Go1._arrayValueSeparator = this._arrayValueSeparator;
        c10027Go1._arrayEmptySeparator = this._arrayEmptySeparator;
        return c10027Go1;
    }
}

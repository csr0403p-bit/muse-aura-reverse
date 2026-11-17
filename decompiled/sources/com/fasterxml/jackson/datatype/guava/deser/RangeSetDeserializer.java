package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC6503E9m;
import X.AbstractC7398Eub;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.BV7;
import X.C3cG;
import X.C9295GCx;
import X.C9829GiP;
import X.C9874GjM;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.google.common.base.Preconditions;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class RangeSetDeserializer extends StdDeserializer implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<Object> _deserializer;

    public RangeSetDeserializer() {
        super((Class<?>) AbstractC6503E9m.class);
        this._deserializer = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C9874GjM A00(X.AbstractC9904Gkk r3, X.AbstractC9870GjI r4) {
        /*
            java.lang.Class<?> r0 = r4._class
            X.Gj8 r3 = r3.A0B()
            java.lang.Class<X.E9m> r1 = X.AbstractC6503E9m.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L44
            X.GjI r0 = r4.A0F(r1)
            if (r0 == 0) goto L41
            X.Gj9 r0 = r0.A0K()
            r2 = 0
            X.GjI[] r1 = r0._types
            int r0 = r1.length
            if (r2 >= r0) goto L41
            r0 = r1[r2]
            if (r0 == 0) goto L41
        L22:
            if (r0 == 0) goto L44
            java.lang.Class<com.google.common.collect.Range> r2 = com.google.common.collect.Range.class
            r1 = 0
            X.GjI[] r0 = new X.AbstractC9870GjI[]{r0}
            r0 = r0[r1]
            X.Gj9 r1 = X.C9861Gj9.A01(r0, r2)
            r0 = 0
            X.GjI r0 = r3.A07(r0, r1, r2)
            X.GjI r1 = X.C9860Gj8.A00(r0, r3)
            java.lang.Class<java.util.List> r0 = java.util.List.class
            X.GjM r0 = r3.A0A(r1, r0)
            return r0
        L41:
            X.GjE r0 = X.C9860Gj8.A05
            goto L22
        L44:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.RangeSetDeserializer.A00(X.Gkk, X.GjI):X.GjM");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [E, java.lang.Object] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final AbstractC6503E9m A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException, InvalidDefinitionException {
        Cut cut;
        Cut cut2;
        Cut cut3;
        Cut cut4;
        JsonDeserializer<Object> jsonDeserializer = this._deserializer;
        if (jsonDeserializer == null) {
            abstractC9904Gkk.A0F("Not contextualized to have value deserializer or value type of `RangeSet` was not available via type parameters", A0h());
            throw F60.createAndThrow();
        }
        Collection collection = (Collection) jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        ImmutableRangeSet<Comparable<?>> immutableRangeSet = ImmutableRangeSet.A01;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : collection) {
            if (obj == null) {
                try {
                    throw BV4.A0a("isEmpty");
                } catch (NullPointerException unused) {
                    abstractC9904Gkk.A0U(abstractC9916Gl7, EnumC9834GiY.VALUE_NULL, this._valueType, "Guava `RangeSet` does not accept `null` values", BV4.A1W());
                    throw F60.createAndThrow();
                }
            }
            Range range = (Range) obj;
            Preconditions.checkArgument(!range.lowerBound.equals(range.upperBound), "range must not be empty, but was %s", range);
            arrayListA0h.add(range);
        }
        ImmutableList.Builder builder = new ImmutableList.Builder(arrayListA0h.size());
        Range<Comparable> range2 = Range.A00;
        Collections.sort(arrayListA0h, Range.RangeLexOrdering.A00);
        Iterator it = arrayListA0h.iterator();
        C9295GCx c9295GCx = it instanceof C9295GCx ? (C9295GCx) it : new C9295GCx(it);
        while (c9295GCx.hasNext()) {
            Range range3 = (Range) c9295GCx.next();
            while (c9295GCx.hasNext()) {
                if (!c9295GCx.A01) {
                    c9295GCx.A00 = c9295GCx.A02.next();
                    c9295GCx.A01 = true;
                }
                Range range4 = (Range) c9295GCx.A00;
                if (range3.lowerBound.A00(range4.upperBound) > 0 || range4.lowerBound.A00(range3.upperBound) > 0) {
                    break;
                }
                Range range5 = range4;
                int iA00 = range3.lowerBound.A00(range4.lowerBound);
                int iA002 = range3.upperBound.A00(range4.upperBound);
                if (iA00 >= 0) {
                    if (iA002 <= 0) {
                        range5 = range3;
                    } else if (iA00 > 0) {
                        cut = range3.lowerBound;
                        cut2 = range4.upperBound;
                        Preconditions.checkArgument(BV7.A1R(cut.A00(cut2)), "intersection is undefined for disconnected ranges %s and %s", range3, range4);
                        range5 = new Range(cut, cut2);
                    }
                } else if (iA002 < 0) {
                    cut = range4.lowerBound;
                    cut2 = range3.upperBound;
                    Preconditions.checkArgument(BV7.A1R(cut.A00(cut2)), "intersection is undefined for disconnected ranges %s and %s", range3, range4);
                    range5 = new Range(cut, cut2);
                }
                Preconditions.checkArgument(range5.lowerBound.equals(range5.upperBound), "Overlapping ranges not permitted but found %s overlapping %s", range3, range4);
                Range range6 = (Range) c9295GCx.next();
                int iA003 = range3.lowerBound.A00(range6.lowerBound);
                int iA004 = range3.upperBound.A00(range6.upperBound);
                if (iA003 > 0) {
                    if (iA004 > 0) {
                        cut3 = range6.lowerBound;
                        cut4 = range3.upperBound;
                        range6 = new Range(cut3, cut4);
                    }
                    range3 = range6;
                } else if (iA004 < 0) {
                    if (iA003 < 0) {
                        cut3 = range3.lowerBound;
                        cut4 = range6.upperBound;
                        range6 = new Range(cut3, cut4);
                    }
                    range3 = range6;
                }
            }
            builder.add((ImmutableList.Builder) range3);
        }
        ImmutableList immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? ImmutableRangeSet.A02 : (immutableListBuild.size() == 1 && AbstractC7398Eub.A01(immutableListBuild).equals(Range.A00)) ? ImmutableRangeSet.A01 : new ImmutableRangeSet(immutableListBuild);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        C9829GiP<AbstractC9870GjI> c9829GiP = abstractC9904Gkk._currentType;
        C9874GjM c9874GjMA00 = A00(abstractC9904Gkk, c9829GiP == null ? null : c9829GiP.A01);
        return (c9874GjMA00 == null && (interfaceC10017Gnp == null || (c9874GjMA00 = A00(abstractC9904Gkk, interfaceC10017Gnp.AM9())) == null)) ? this : new RangeSetDeserializer(abstractC9904Gkk.A0G(interfaceC10017Gnp, c9874GjMA00), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSetDeserializer(RangeSetDeserializer rangeSetDeserializer, JsonDeserializer<Object> jsonDeserializer) {
        super((StdDeserializer<?>) jsonDeserializer);
        this._deserializer = rangeSetDeserializer;
    }
}

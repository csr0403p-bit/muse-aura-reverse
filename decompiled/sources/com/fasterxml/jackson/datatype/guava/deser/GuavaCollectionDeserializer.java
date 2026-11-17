package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9986Gn8;
import X.EnumC10062Goj;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMultiset;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Collection;

/* loaded from: classes6.dex */
public abstract class GuavaCollectionDeserializer<T> extends ContainerDeserializerBase<T> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer<?> _valueDeserializer;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A04._mask, r11._featureFlags) != false) goto L53;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00a3: INVOKE (r5v0 ?? I:X.Gkk), (r6v0 ?? I:X.Gl7), (r7 I:X.GiY), (r8 I:X.GjI), (r9 I:java.lang.String), (r10 I:java.lang.Object[]) VIRTUAL call: X.Gkk.A0U(X.Gl7, X.GiY, X.GjI, java.lang.String, java.lang.Object[]):void A[MD:(X.Gl7, X.GiY, X.GjI, java.lang.String, java.lang.Object[]):void VARARG throws com.fasterxml.jackson.databind.exc.MismatchedInputException (m)] (LINE:163), block:B:44:0x0093 */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, X.DPa] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.DPa] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A0i(X.AbstractC9916Gl7 r10, X.AbstractC9904Gkk r11) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Object");
    }

    public final Object A1K() {
        return this instanceof ImmutableSortedSetDeserializer ? RegularImmutableSortedSet.A01 : this instanceof ImmutableSortedMultisetDeserializer ? RegularImmutableSortedMultiset.A04 : this instanceof ImmutableSetDeserializer ? RegularImmutableSet.A05 : this instanceof ImmutableMultisetDeserializer ? RegularImmutableMultiset.A03 : this instanceof ImmutableListDeserializer ? ImmutableList.of() : ((GuavaMultisetDeserializer) this).A1L();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        Boolean boolA10 = A10(EnumC10062Goj.A01, interfaceC10017Gnp, abstractC9904Gkk, Collection.class);
        JsonDeserializer<?> jsonDeserializerA07 = StdDeserializer.A07(interfaceC10017Gnp, abstractC9904Gkk, this._valueDeserializer);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this._valueTypeDeserializer;
        if (jsonDeserializerA07 == null) {
            jsonDeserializerA07 = abstractC9904Gkk.A0G(interfaceC10017Gnp, this._containerType.A07());
        }
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA07);
        if (boolA10 == this._unwrapSingle && interfaceC10165GqaA0y == this._nullProvider && jsonDeserializerA07 == this._valueDeserializer && abstractC9986Gn8A03 == this._valueTypeDeserializer) {
            return this;
        }
        if (this instanceof ImmutableSortedSetDeserializer) {
            return new ImmutableSortedSetDeserializer(this._containerType, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
        }
        if (this instanceof ImmutableSortedMultisetDeserializer) {
            return new ImmutableSortedMultisetDeserializer(this._containerType, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
        }
        if (this instanceof ImmutableSetDeserializer) {
            return new ImmutableSetDeserializer(this._containerType, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
        }
        if (this instanceof ImmutableMultisetDeserializer) {
            return new ImmutableMultisetDeserializer(this._containerType, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
        }
        if (this instanceof ImmutableListDeserializer) {
            return new ImmutableListDeserializer(this._containerType, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
        }
        if (this instanceof TreeMultisetDeserializer) {
            return new TreeMultisetDeserializer(this._containerType, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
        }
        boolean z = this instanceof LinkedHashMultisetDeserializer;
        AbstractC9870GjI abstractC9870GjI = this._containerType;
        return z ? new LinkedHashMultisetDeserializer(abstractC9870GjI, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10) : new HashMultisetDeserializer(abstractC9870GjI, jsonDeserializerA07, interfaceC10165GqaA0y, abstractC9986Gn8A03, boolA10);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gn8;LX/Gqa;Ljava/lang/Boolean;)V */
    public GuavaCollectionDeserializer(AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9986Gn8 abstractC9986Gn8, Boolean bool) {
        super(abstractC9870GjI, interfaceC10165Gqa, bool);
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._valueDeserializer = jsonDeserializer;
    }
}

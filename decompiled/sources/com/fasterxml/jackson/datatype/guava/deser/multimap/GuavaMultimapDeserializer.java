package com.fasterxml.jackson.datatype.guava.deser.multimap;

import X.AbstractC9870GjI;
import X.AbstractC9877Gjl;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AbstractC9986Gn8;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C10119Gpk;
import X.C3cG;
import X.C8j3;
import X.C9516GMj;
import X.C9868GjG;
import X.EnumC9834GiY;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC5010DNv;
import X.InterfaceC5023DOs;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.list.ArrayListMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.list.LinkedListMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.HashMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.LinkedHashMultimapDeserializer;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GuavaMultimapDeserializer<T extends InterfaceC5023DOs<Object, Object>> extends StdDeserializer<T> implements InterfaceC9830GiT {
    public static final List<String> A00 = ImmutableList.of("copyOf", "create");
    public static final long serialVersionUID = 1;
    public final Method creatorMethod;
    public final JsonDeserializer<?> elementDeserializer;
    public final AbstractC9986Gn8 elementTypeDeserializer;
    public final AbstractC9877Gjl keyDeserializer;
    public final InterfaceC10165Gqa nullProvider;
    public final boolean skipNullValues;
    public final C9868GjG type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect types in method signature: (LX/GjG;LX/Gjl;LX/Gn8;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)V */
    public GuavaMultimapDeserializer(JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, AbstractC9986Gn8 abstractC9986Gn8, C9868GjG c9868GjG) throws NoSuchMethodException, SecurityException {
        Method method;
        Class<?> cls = c9868GjG._class;
        if (cls == LinkedListMultimap.class || cls == InterfaceC5010DNv.class || cls == InterfaceC5023DOs.class) {
            method = null;
        } else {
            List<String> list = A00;
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        method = cls.getDeclaredMethod(AnonymousClass005.A0j(it), InterfaceC5023DOs.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    if (method != null) {
                        break;
                    }
                } else {
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            method = cls.getMethod(AnonymousClass005.A0j(it2), InterfaceC5023DOs.class);
                        } catch (NoSuchMethodException unused2) {
                        }
                        if (method != null) {
                            break;
                        }
                    }
                }
            }
        }
        this(jsonDeserializer, abstractC9877Gjl, null, abstractC9986Gn8, c9868GjG, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
    
        if (r7.A1P() == r4) goto L63;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0112 -> B:61:0x00f2). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A0i(X.AbstractC9916Gl7 r7, X.AbstractC9904Gkk r8) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.A0i(X.Gl7, X.Gkk):X.DOs");
    }

    private final T A1K() {
        if (!(this instanceof LinkedHashMultimapDeserializer)) {
            return this instanceof HashMultimapDeserializer ? new HashMultimap() : this instanceof LinkedListMultimapDeserializer ? new LinkedListMultimap() : new ArrayListMultimap();
        }
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(16);
        LinkedHashMultimap linkedHashMultimap = new LinkedHashMultimap();
        Preconditions.checkArgument(compactLinkedHashMap.isEmpty());
        ((AbstractMapBasedMultimap) linkedHashMultimap).A01 = compactLinkedHashMap;
        linkedHashMultimap.A00 = 2;
        linkedHashMultimap.A00 = 2;
        LinkedHashMultimap.ValueEntry<K, V> valueEntry = new LinkedHashMultimap.ValueEntry<>(null, null, null, 0);
        linkedHashMultimap.A01 = valueEntry;
        valueEntry.successorInMultimap = valueEntry;
        valueEntry.predecessorInMultimap = valueEntry;
        return linkedHashMultimap;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9877Gjl abstractC9877GjlA0L = this.keyDeserializer;
        if (abstractC9877GjlA0L == null) {
            abstractC9877GjlA0L = abstractC9904Gkk.A0L(this.type._keyType);
        }
        JsonDeserializer<?> jsonDeserializer = this.elementDeserializer;
        AbstractC9870GjI abstractC9870GjI = this.type._valueType;
        JsonDeserializer jsonDeserializerA0G = jsonDeserializer == null ? abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjI) : abstractC9904Gkk.A0I(interfaceC10017Gnp, abstractC9870GjI, jsonDeserializer);
        AbstractC9986Gn8 abstractC9986Gn8A03 = this.elementTypeDeserializer;
        if (abstractC9986Gn8A03 != null) {
            abstractC9986Gn8A03 = abstractC9986Gn8A03.A03(interfaceC10017Gnp);
        }
        C9868GjG c9868GjG = this.type;
        Method method = this.creatorMethod;
        InterfaceC10165Gqa interfaceC10165GqaA0y = A0y(interfaceC10017Gnp, abstractC9904Gkk, jsonDeserializerA0G);
        return this instanceof LinkedHashMultimapDeserializer ? new LinkedHashMultimapDeserializer(jsonDeserializerA0G, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03, c9868GjG, method) : this instanceof HashMultimapDeserializer ? new HashMultimapDeserializer(jsonDeserializerA0G, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03, c9868GjG, method) : this instanceof LinkedListMultimapDeserializer ? new LinkedListMultimapDeserializer(jsonDeserializerA0G, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03, c9868GjG, method) : new ArrayListMultimapDeserializer(jsonDeserializerA0G, abstractC9877GjlA0L, interfaceC10165GqaA0y, abstractC9986Gn8A03, c9868GjG, method);
    }

    public static void A01(AbstractC9916Gl7 abstractC9916Gl7, EnumC9834GiY enumC9834GiY) throws JsonMappingException {
        if (abstractC9916Gl7.A1O() == enumC9834GiY) {
            return;
        }
        StringBuilder sbA0f = C3cG.A0f(enumC9834GiY, "Expecting ");
        sbA0f.append(" to start `MultiMap` value, found ");
        String strA14 = C8j3.A14(abstractC9916Gl7.A1N(), sbA0f);
        C9516GMj c9516GMjA1I = abstractC9916Gl7.A1I();
        JsonMappingException jsonMappingException = new JsonMappingException(strA14, (Throwable) null);
        jsonMappingException._location = c9516GMjA1I;
        jsonMappingException.A00 = abstractC9916Gl7;
        throw jsonMappingException;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjG;LX/Gjl;LX/Gn8;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;Ljava/lang/reflect/Method;LX/Gqa;)V */
    public GuavaMultimapDeserializer(JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, InterfaceC10165Gqa interfaceC10165Gqa, AbstractC9986Gn8 abstractC9986Gn8, C9868GjG c9868GjG, Method method) {
        boolean zA1Z;
        super(c9868GjG);
        this.type = c9868GjG;
        this.keyDeserializer = abstractC9877Gjl;
        this.elementTypeDeserializer = abstractC9986Gn8;
        this.elementDeserializer = jsonDeserializer;
        this.creatorMethod = method;
        this.nullProvider = interfaceC10165Gqa;
        if (interfaceC10165Gqa == null) {
            zA1Z = false;
        } else {
            zA1Z = AnonymousClass002.A1Z(interfaceC10165Gqa, C10119Gpk.A01);
        }
        this.skipNullValues = zA1Z;
    }
}

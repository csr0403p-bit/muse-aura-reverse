package X;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import java.util.Collection;

/* renamed from: X.God, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10056God {
    public final AbstractC9870GjI A09(AbstractC9870GjI abstractC9870GjI) {
        Hgc[] hgcArr = ((AbstractC9905Gkl) this)._factoryConfig._abstractTypeResolvers;
        if (hgcArr.length > 0) {
            GQ2 gq2A01 = GQ2.A01(hgcArr);
            if (gq2A01.hasNext()) {
                gq2A01.next();
                throw BV4.A0a("findTypeMapping");
            }
        }
        return abstractC9870GjI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0244, code lost:
    
        if (r6.substring(17).contains("List") != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0263, code lost:
    
        if (r2.contains("Set") != false) goto L113;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/GjM;LX/Gl4;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer A0A(X.AbstractC9904Gkk r17, X.C9914Gl4 r18, X.C9874GjM r19) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10056God.A0A(X.Gkk, X.Gl4, X.GjM):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Gl7] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Giw] */
    public final AbstractC9852Giw A0B(C9898Gke c9898Gke, AbstractC9870GjI abstractC9870GjI) {
        AbstractC9870GjI abstractC9870GjIA09;
        C9909Gkr c9909Gkr = c9898Gke.A05(abstractC9870GjI._class).A07;
        AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
        InterfaceC10043GoN<?> interfaceC10043GoNA00 = abstractC9910GksA02 instanceof C9888GkO ? C9888GkO.A00(c9898Gke, c9909Gkr, (C9888GkO) abstractC9910GksA02) : null;
        ?? A5X = 0;
        if (interfaceC10043GoNA00 == null && (interfaceC10043GoNA00 = c9898Gke._base._typeResolverBuilder) == null) {
            return null;
        }
        Collection<HjD> collectionA05 = c9898Gke._subtypeResolver.A05(c9898Gke, c9909Gkr);
        StdTypeResolverBuilder stdTypeResolverBuilder = (StdTypeResolverBuilder) interfaceC10043GoNA00;
        if (stdTypeResolverBuilder._defaultImpl == null && abstractC9870GjI.A0P() && (abstractC9870GjIA09 = A09(abstractC9870GjI)) != null) {
            Class<?> cls = abstractC9870GjI._class;
            Class<?> cls2 = abstractC9870GjIA09._class;
            if (cls2 != cls) {
                if (stdTypeResolverBuilder._defaultImpl != cls2) {
                    AbstractC9855Gj3.A0E(StdTypeResolverBuilder.class, stdTypeResolverBuilder, "withDefaultImpl");
                    stdTypeResolverBuilder = new StdTypeResolverBuilder();
                    stdTypeResolverBuilder._typeIdVisible = false;
                    stdTypeResolverBuilder._idType = stdTypeResolverBuilder._idType;
                    stdTypeResolverBuilder._includeAs = stdTypeResolverBuilder._includeAs;
                    stdTypeResolverBuilder._typeProperty = stdTypeResolverBuilder._typeProperty;
                    stdTypeResolverBuilder._typeIdVisible = stdTypeResolverBuilder._typeIdVisible;
                    stdTypeResolverBuilder._customIdResolver = stdTypeResolverBuilder._customIdResolver;
                    stdTypeResolverBuilder._defaultImpl = cls2;
                    stdTypeResolverBuilder._requireTypeIdForSubtypes = stdTypeResolverBuilder._requireTypeIdForSubtypes;
                }
                interfaceC10043GoNA00 = stdTypeResolverBuilder;
            }
        }
        try {
            A5X = interfaceC10043GoNA00.A5X(c9898Gke, abstractC9870GjI, collectionA05);
            return A5X;
        } catch (IllegalArgumentException | IllegalStateException e) {
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException((AbstractC9916Gl7) A5X, abstractC9870GjI, AbstractC9855Gj3.A0A(e));
            invalidDefinitionException.initCause(e);
            throw invalidDefinitionException;
        }
    }
}

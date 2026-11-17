package com.fasterxml.jackson.databind.exc;

import X.AbstractC9870GjI;
import X.AbstractC9916Gl7;
import X.AbstractC9919GlE;
import X.AbstractC9958GmS;
import X.C9914Gl4;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: classes6.dex */
public class InvalidDefinitionException extends JsonMappingException {
    public transient C9914Gl4 A00;
    public transient AbstractC9958GmS A01;
    public final AbstractC9870GjI _type;

    public InvalidDefinitionException(AbstractC9916Gl7 abstractC9916Gl7, C9914Gl4 c9914Gl4, AbstractC9958GmS abstractC9958GmS, String str) {
        super(abstractC9916Gl7, str);
        this._type = c9914Gl4 == null ? null : c9914Gl4.A05;
        this.A00 = c9914Gl4;
        this.A01 = abstractC9958GmS;
    }

    public InvalidDefinitionException(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI, String str) {
        super(abstractC9916Gl7, str);
        this._type = abstractC9870GjI;
        this.A00 = null;
        this.A01 = null;
    }

    public InvalidDefinitionException(AbstractC9919GlE abstractC9919GlE, AbstractC9870GjI abstractC9870GjI, String str) {
        super(abstractC9919GlE, str);
        this._type = abstractC9870GjI;
        this.A00 = null;
        this.A01 = null;
    }

    public InvalidDefinitionException(AbstractC9919GlE abstractC9919GlE, C9914Gl4 c9914Gl4, AbstractC9958GmS abstractC9958GmS, String str) {
        super(abstractC9919GlE, str);
        this._type = c9914Gl4.A05;
        this.A00 = c9914Gl4;
        this.A01 = abstractC9958GmS;
    }
}

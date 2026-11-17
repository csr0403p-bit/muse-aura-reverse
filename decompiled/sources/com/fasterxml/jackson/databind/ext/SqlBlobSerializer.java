package com.fasterxml.jackson.databind.ext;

import X.AbstractC9842Gii;
import X.AbstractC9846Gip;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.sql.Blob;
import java.sql.SQLException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class SqlBlobSerializer extends StdScalarSerializer<Blob> {
    public SqlBlobSerializer() {
        super(Blob.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws SQLException, JsonMappingException {
        Blob blob = (Blob) obj;
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_EMBEDDED_OBJECT, abstractC9996GnP, blob);
        A00(abstractC9919GlE, abstractC9842Gii, blob);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Blob blob) throws SQLException, JsonMappingException {
        try {
            abstractC9919GlE.A0Z(abstractC9842Gii._config._base._defaultBase64, blob.getBinaryStream(), -1);
        } catch (SQLException e) {
            throw new JsonMappingException(((AbstractC9846Gip) abstractC9842Gii).A00, "Failed to access `java.sql.Blob` value to write as binary value", e);
        }
    }
}

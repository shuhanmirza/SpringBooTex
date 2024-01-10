package org.shuhanmirza.springbootex.service;

import org.shuhanmirza.springbootex.dto.request.PdfGenerationRequest;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * @author Shuhan Mirza
 * @since 27/12/23
 */
public interface PdfGenerationService {
    Mono<ResponseEntity<?>> generatePdfFromTemplate(PdfGenerationRequest pdfGenerationRequest);
}

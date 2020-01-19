package af.gov.anar.lib.cors.data.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The CorsEntity class with required fields to be captured and recorded
 */
@Entity()
@Table(name = "cors")
@EqualsAndHashCode
@AllArgsConstructor
@DynamicUpdate
@Getter
@Setter
public class CorsEntity {

    /**
     * Field for immutable universally unique identifier (UUID)
     */
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String uuid;


    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    /**
     * Constructor to initialize {@link } with uuid and timestamp
     */
    public CorsEntity() {
        uuid = UUID.randomUUID().toString();
    }


    @Column(name = "allowed_origin", unique = true)
    private String allowedOrigin;


    @Column(name = "allowed_method", unique = true)
    private String allowedMethod;


    @Column(name = "allowed_header", unique = true)
    private String allowedHeader;


}

package com.techbank.account.query.api.queries;

import com.techbank.cqrs.core.queries.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class FindAccountByIdQuery extends BaseQuery {
    private String id;
}

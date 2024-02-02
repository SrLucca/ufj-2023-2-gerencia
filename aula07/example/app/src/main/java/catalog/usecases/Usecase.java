package catalog.usecases;

public interface Usecase<InputDto, OutputDto>{
    
    OutputDto execute(InputDto inputDto);

}

package catalog.usecases;

// Command
public interface Usecase<InputDto, OutputDto>{
    
    OutputDto execute(InputDto input);

}
